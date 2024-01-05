package com.example.patterns.behavioral.observer.listeners;

public class FirebasePushNotificationListener implements NotificationListener {
    private String token;

    public FirebasePushNotificationListener(String token) {
        this.token = token;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tОтправлено пуш-уведомление в андроид-приложение по токену %s о %s в %s\n", token, notificationType, chainStoreName);
    }
}
