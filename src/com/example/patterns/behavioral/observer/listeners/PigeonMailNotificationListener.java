package com.example.patterns.behavioral.observer.listeners;

public class PigeonMailNotificationListener implements NotificationListener {
    private String fullAddress;

    public PigeonMailNotificationListener(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public void update(NotificationType notificationType, String chainStoreName) {
        System.out.printf("\tОтправлен почтовый голубь с буклетом по адресу %s о %s в %s\n", fullAddress, notificationType, chainStoreName);
    }
}
