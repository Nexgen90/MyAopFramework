package com.example.framework.infrastructure;

import java.util.Map;

public class Application {
    public static ApplicationContext run(String packageToScan, Map<Class, Class> ifc2ImpleClass) {
        JavaConfig config = new JavaConfig(packageToScan, ifc2ImpleClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        //todo: init all singletons which are not lazy
        context.setFactory(objectFactory);
        return context;
    }
}
