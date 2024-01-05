package com.example.patterns.behavioral.observer.listeners;

public class EmailNotificationListener implements NotificationListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tОтправлено уведомление на почту %s о %s в %s\n", email, notificationType, chainStoreName);
    }
}
