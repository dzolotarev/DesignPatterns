package com.example.patterns.behavioral.observer.listeners;

public interface NotificationListener {
    void update(NotificationType notificationType, String chain);
}
