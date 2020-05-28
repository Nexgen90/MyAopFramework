package com.example.framework.business;

import com.example.framework.infrastructure.configurators.singletone.InjectByType;

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommendator recommendator;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
