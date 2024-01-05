package com.example.patterns.behavioral.mediator;

public class User {
    private Mediator mediator;
    private int id;
    private String name;

    public User(Mediator mediator, int id, String name) {
        this.mediator = mediator;
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void send(String msg, int userId) {
        System.out.println(name + " :: исходящее сообщение : " + msg);
        mediator.sendMessage(msg, userId);
    }

    public void receive(String msg) {
        System.out.println(name + " :: входящее сообщение : " + msg);
    }
}