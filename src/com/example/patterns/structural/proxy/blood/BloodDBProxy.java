package com.example.patterns.structural.proxy.blood;

import com.example.patterns.structural.proxy.security.SecuritySystem;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Denis Zolotarev on 01.11.2023.
 */
public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    public BloodDBProxy() {
        this.security = new SecuritySystem();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input login:");
        String login = scanner.nextLine();
        System.out.println("Input password:");
        String password = scanner.nextLine();
        security.authorize(login, password);
        if (security.isAuthorized()) {
            this.db = new BloodDB();
        }
    }

    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized() && db != null) {
            return db.getById(id);
        } else {
            return denied;
        }
    }

    @Override
    public List<BloodSample> find(String request) {
        if (security.isAuthorized() && db != null) {
            return db.find(request);
        } else {
            return Collections.singletonList(denied);
        }
    }
}
