package com.example.patterns.behavioral.observer;

/* 
У вас скидка!
*/

import com.example.patterns.behavioral.observer.listeners.EmailNotificationListener;
import com.example.patterns.behavioral.observer.listeners.FirebasePushNotificationListener;
import com.example.patterns.behavioral.observer.listeners.PigeonMailNotificationListener;

import static com.example.patterns.behavioral.observer.listeners.NotificationType.*;

public class Solution {

    public static ChainStore atb = new ChainStore("АТБ");
    public static ChainStore lidl = new ChainStore("Lidl");
    public static ChainStore walmart = new ChainStore("Walmart");

    public static void main(String[] args) {
        subscribeAll();

        lunchAll(atb);
        lunchAll(lidl);
        lunchAll(walmart);
    }

    public static void subscribeAll() {
        atb.notifications.subscribe(EVENT, new EmailNotificationListener("diego@javarush.co"));
        atb.notifications.subscribe(EVENT, new EmailNotificationListener("imyarek@javarush.co"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("123456789"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("562346245626"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("234534565636787689"));
        atb.notifications.subscribe(SALE, new FirebasePushNotificationListener("2345245763537"));

        lidl.notifications.subscribe(EVENT, new EmailNotificationListener("diego@javarush.co"));

        walmart.notifications.subscribe(EVENT, new EmailNotificationListener("diego@javarush.co"));
        walmart.notifications.subscribe(PROMO, new PigeonMailNotificationListener("Лондон, Бейкер-стрит, 221b"));
    }

    public static void lunchAll(ChainStore store) {
        store.launchEvent();
        store.launchPromo();
        store.launchPersonalOffer();
        store.launchSale();
    }
}