package com.example.patterns.behavioral.strategy.customer;

import java.time.LocalDate;

public class Customer {
    private CreditCard card;
    private PaypalAccount paypalAccount;

    public Customer(String name, String email, String cardNumber, int cardCvv, LocalDate cardEexpiryDate, String paypalPassword) {
        this.card = new CreditCard(cardNumber, name, cardCvv, cardEexpiryDate);
        this.paypalAccount = new PaypalAccount(email, paypalPassword);
    }

    public String getName() {
        return card.getName();
    }

    public String getEmail() {
        return paypalAccount.getEmail();
    }

    public String getCardNumber() {
        return card.getNumber();
    }

    public int getCardCvv() {
        return card.getCvv();
    }

    public LocalDate getCardExpiryDate() {
        return card.getExpiryDate();
    }

    public String getPaypalPassword() {
        return paypalAccount.getPassword();
    }
}
