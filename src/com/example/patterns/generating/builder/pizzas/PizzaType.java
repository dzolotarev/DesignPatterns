package com.example.patterns.generating.builder.pizzas;

public enum PizzaType {
    HAWAIIAN("Гавайская пицца"),
    SPICY("Острая пицца");

    private final String title;

    PizzaType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
