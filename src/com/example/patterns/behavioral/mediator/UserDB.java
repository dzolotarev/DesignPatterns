package com.example.patterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

public class UserDB {

    private Map<Integer, User> users = new HashMap<>();

    public void add(User user) {
        users.put(user.getId(), user);
    }

    public User getById(int id) {
        return users.get(id);
    }
}
