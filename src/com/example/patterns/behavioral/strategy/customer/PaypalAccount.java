package com.example.patterns.behavioral.strategy.customer;

public class PaypalAccount {
    private String email;
    private String password;

    public PaypalAccount(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
