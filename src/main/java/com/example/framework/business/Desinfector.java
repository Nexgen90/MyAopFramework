package com.example.framework.business;

import com.example.framework.infrastructure.configurators.singletone.InjectByType;

public class Desinfector {
    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

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
