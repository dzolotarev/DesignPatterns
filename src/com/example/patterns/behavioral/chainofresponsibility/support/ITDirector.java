package com.example.patterns.behavioral.chainofresponsibility.support;

public class ITDirector extends TechSupport {
    @Override
    public void solve(String problem) {
        if (problem.matches(".*(договор поставки|аутсорс|аутстафф|корпоратив|премия).*")) {
            System.out.println("\t+ Директор департамента ИТ все рассмотрел и согласовал.");
        } else {
            System.out.println("\t- Директор департамента ИТ решил отправить весь департамент на курсы повышения квалификации.");
        }
    }
}
