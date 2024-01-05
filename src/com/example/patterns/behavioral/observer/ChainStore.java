package com.example.patterns.behavioral.observer;

import com.example.patterns.behavioral.observer.listeners.NotificationType;
import com.example.patterns.behavioral.observer.publisher.NotificationManager;

import static com.example.patterns.behavioral.observer.listeners.NotificationType.*;

public class ChainStore {

    private final String name;
    public NotificationManager notifications;

    public ChainStore(String name) {
        this.name = name;
        notifications = new NotificationManager(NotificationType.values());

    }

    public void launchPersonalOffer() {
        System.out.println(name + " запускает соблазнительные персональные скидки!");
        notifications.notify(PERSONAL_OFFER, name);
    }

    public void launchSale() {
        System.out.println(name + " запускает горячую распродажу!");
        notifications.notify(SALE, name);
    }

    public void launchPromo() {
        System.out.println("В " + name + " стартует супер промо акция!");
        notifications.notify(PROMO, name);
    }

    public void launchEvent() {
        System.out.println("В " + name + " состоится грандиозное мероприятие!");
        notifications.notify(EVENT, name);
    }
}
