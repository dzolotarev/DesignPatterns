package com.example.patterns.behavioral.doublechecklocking;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static java.util.Objects.isNull;

public class UserDB {

    private volatile Map<Integer, User> users;

    private void initDB() throws Exception {

        if (isNull(users)) {
            synchronized (this) {
                if (isNull(users)) {
                    Map<Integer, User> threadUsers = new HashMap<>();
                    for (int i = 0; i < 100; i++) {
                        threadUsers.put(i, new User(i, "user" + i));
                        TimeUnit.MILLISECONDS.sleep(1);
                    }
                    users = threadUsers;
                }
            }
        }
    }

    public Map<Integer, User> getDB() throws Exception {
        initDB();
        return users;
    }
}
