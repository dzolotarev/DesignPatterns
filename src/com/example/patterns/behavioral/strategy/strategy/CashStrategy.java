package com.example.patterns.behavioral.strategy.strategy;

public class CashStrategy implements PaymentStrategy {
    public CashStrategy() {
    }

    @Override
    public void pay(int amount) {
        System.out.printf("Оплачено товаров на $%d наличными.\n", amount);
    }
}
