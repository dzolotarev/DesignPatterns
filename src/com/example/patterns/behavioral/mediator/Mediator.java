package com.example.patterns.behavioral.mediator;

public interface Mediator {
    void sendMessage(String msg, int userId);

    void register(User user);
}
