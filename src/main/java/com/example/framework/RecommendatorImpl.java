package com.example.framework;

public class RecommendatorImpl implements Recommendator {
    @InjectProperty("vine")
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("Реклама: пейте " + alcohol);
    }
}
