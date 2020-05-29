package com.example.framework.business;

import com.example.framework.infrastructure.Singleton;
import com.example.framework.infrastructure.configurators.property.InjectProperty;

@Singleton
@Deprecated
public class RecommendatorImpl implements Recommendator {
    @InjectProperty("vine")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("Реклама: пейте " + alcohol);
    }
}
