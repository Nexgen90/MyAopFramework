package com.example.framework;

import com.example.framework.business.Desinfector;
import com.example.framework.business.Policeman;
import com.example.framework.business.PolicemanImpl;
import com.example.framework.business.Room;
import com.example.framework.infrastructure.Application;
import com.example.framework.infrastructure.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = Application.run("com.example", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        Desinfector desinfector = context.getObject(Desinfector.class);
        desinfector.start(new Room());
    }
}
