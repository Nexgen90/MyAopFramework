package com.example.framework.business;

import com.example.framework.infrastructure.ObjectFactory;

public class Desinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        announcer.announce("Дезинфектор: Помещение необходимо продезенфицировать");
        policeman.makePeopleLeaveRoom();
        desinfect(room);
        announcer.announce("Дезинфектор: Дезинфекция завершена. Можно возвращаться");
    }

    private void desinfect(Room room) {
        System.out.println("Дезинфектор: Начата дезинфекция!");
    }
}
