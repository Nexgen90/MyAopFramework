package com.example.framework.infrastructure;

import com.example.framework.business.AngryPolicemanImpl;
import com.example.framework.business.Policeman;
import com.example.framework.infrastructure.configurators.ObjectConfigurator;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private List<ObjectConfigurator> configurators = new ArrayList<>();
    private Config config;

    @SneakyThrows
    private ObjectFactory() {
        config = new JavaConfig("com.example", new HashMap<>(Map.of(Policeman.class, AngryPolicemanImpl.class)));
        for (Class<? extends ObjectConfigurator> aClass : config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
    }

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    @SneakyThrows
    public <T> T createObject(Class<T> type) {
        Class<? extends T> implClass = type;
        if (type.isInterface()) {
            implClass = config.getImplClass(type);
        }

        T t = implClass.getDeclaredConstructor().newInstance();
        configurators.forEach(objectConfigurator -> objectConfigurator.configure(t));
        return t;
    }
}
