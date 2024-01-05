package com.example.patterns.behavioral.mediator;

public class Chat implements Mediator {
    private UserDB db;

    public Chat(UserDB db) {
        this.db = db;
    }

    @Override
    public void sendMessage(String msg, int userId) {
        User user = db.getById(userId);
        user.receive(msg);
    }

    @Override
    public void register(User user) {
        db.add(user);
    }
}
