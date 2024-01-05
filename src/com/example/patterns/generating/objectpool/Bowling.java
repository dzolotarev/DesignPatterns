package com.example.patterns.generating.objectpool;

import java.util.*;
import java.util.concurrent.*;

import static java.util.Objects.nonNull;

public class Bowling {
    private final Queue<Track> tracks = new ConcurrentLinkedQueue<>();
    private final Queue<PairOfShoes> shoesShelf = new ConcurrentLinkedQueue<>();

    public Bowling(int tracksNumber) {
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.offer(new Track(i));
        }
        for (int i = 0; i < 50; i++) {
            int shoesSize = ThreadLocalRandom.current().nextInt(38, 46);
            shoesShelf.offer(new PairOfShoes(shoesSize));
        }
    }

    public synchronized Track acquireTrack() {
        Track track = tracks.poll();
        if (nonNull(track)) {
            track.setPrice(100 - tracks.size() * 10);
        }
        return track;
    }

    public synchronized void releaseTrack(Track track) {
        System.out.printf("C дорожки №%d сняли бронь\n", track.getNumber());
        tracks.offer(track);
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        Set<PairOfShoes> shoes = null;
        if (shoesShelf.size() >= number) {
            shoes = new HashSet<>();
            for (int i = 0; i < number; i++) {
                shoes.add(shoesShelf.poll());
            }
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        System.out.printf("В гардероб вернули %d пар обуви\n", shoes.size());
        shoesShelf.addAll(shoes);
    }
}
