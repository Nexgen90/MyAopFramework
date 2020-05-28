package com.example.framework.infrastructure.configurators;

import com.example.framework.infrastructure.ApplicationContext;

public interface ObjectConfigurator {
    void configure(Object t, ApplicationContext context);
}
