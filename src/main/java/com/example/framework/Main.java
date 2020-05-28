package com.example.framework;

import com.example.framework.business.Desinfector;
import com.example.framework.business.Room;
import com.example.framework.infrastructure.ObjectFactory;

public class Main {
    public static void main(String[] args) {
        Desinfector desinfector = ObjectFactory.getInstance().createObject(Desinfector.class);
        desinfector.start(new Room());
    }
}
