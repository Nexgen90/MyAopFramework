package com.example.framework.infrastructure.configurators.singletone;

import com.example.framework.infrastructure.ObjectFactory;
import com.example.framework.infrastructure.configurators.ObjectConfigurator;
import lombok.SneakyThrows;

import java.lang.reflect.Field;

public class InjectByTypeObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        for (Field field : t.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Object object = ObjectFactory.getInstance().createObject(field.getType());
                field.set(t, object);
            }
        }
    }
}
