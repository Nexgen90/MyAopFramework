package com.example.framework;

public class Desinfector {

    public void start(Room room) {
        //todo: сообщить всем присутствующим в комнате о начале дезинфекции, попросить покинуть комнату
        //todo: разогнать всех, кто не вышел после объявления
        desinfect(room);
        //todo: сообщить всем присутствовавшим в комнате, что они могут вернуться обратно
    }

    private void desinfect(Room room) {
        System.out.println("Начата дезинфекция!");
    }
}
