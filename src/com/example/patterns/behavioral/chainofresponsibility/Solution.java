package com.example.patterns.behavioral.chainofresponsibility;

/* 
Техподдержка
*/

public class Solution {

    public static void main(String[] args) {
        CRM crm = new CRM();
        crm.register("Сломалась мышка - не работает колесико.");
        crm.register("Глючит клавиатура.");
        crm.register("Нужно выбрать место для летнего корпоратива.");
        crm.register("Нужна резервная копия ПК главбуха за позавчера.");
        crm.register("Ничего не работает.");
    }
}
