package com.example.patterns.behavioral.strategy.strategy;

import com.example.patterns.behavioral.strategy.customer.Customer;

public class PaypalStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PaypalStrategy(Customer customer) {
        this.email = customer.getEmail();
        this.password = customer.getPaypalPassword();
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Оплачено товаров на $%d с помощью Paypal.\n", amount);
    }
}
