package com.example.framework.business;

import com.example.framework.infrastructure.configurators.singletone.InjectByType;

import javax.annotation.PostConstruct;

public class PolicemanImpl implements Policeman {

    @InjectByType
    private Recommendator recommendator;

    @PostConstruct
    public void init() {
        System.out.println("<PolicemanImpl>: " + recommendator.getClass());
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Говорит полиция: Пожалуйста, все покиньте помещение.");
    }
}
