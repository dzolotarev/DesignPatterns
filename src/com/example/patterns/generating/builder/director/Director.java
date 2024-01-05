package com.example.patterns.generating.builder.director;

import com.example.patterns.generating.builder.builders.Builder;
import com.example.patterns.generating.builder.pizzas.PizzaType;

/**
 * Created by Denis Zolotarev on 04.11.2023.
 */
public class Director {
    public void makeHawaiianPizza(Builder builder) {
        builder.setType(PizzaType.HAWAIIAN);
        builder.setDough("обычное");
        builder.setSauce("мягкий");
        builder.setTopping("ветчина + ананас");

    }

    public void makeSpicyPizza(Builder builder) {
        builder.setType(PizzaType.SPICY);
        builder.setDough("запеченное");
        builder.setSauce("острый");
        builder.setTopping("пепперони + салями");

    }
}
