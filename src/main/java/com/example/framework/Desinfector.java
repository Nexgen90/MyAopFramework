package com.example.framework;

public class Desinfector {

    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

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
