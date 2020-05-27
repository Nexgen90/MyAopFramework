package com.example.framework;

import com.example.framework.business.Desinfector;
import com.example.framework.business.Room;

public class Main {
    public static void main(String[] args) {
        Desinfector desinfector = new Desinfector();
        desinfector.start(new Room());
    }
}
