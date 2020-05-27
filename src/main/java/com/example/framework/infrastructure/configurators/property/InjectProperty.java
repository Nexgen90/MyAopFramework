package com.example.framework.infrastructure.configurators.property;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value = RetentionPolicy.RUNTIME)
public @interface InjectProperty {
    String value() default "";
}
