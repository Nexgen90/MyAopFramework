package com.example.framework.business;

import com.example.framework.business.Announcer;
import com.example.framework.business.Recommendator;
import com.example.framework.infrastructure.ObjectFactory;

public class ConsoleAnnouncer implements Announcer {
    private Recommendator recommendator = ObjectFactory.getInstance().createObject(Recommendator.class);

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommendator.recommend();
    }
}
