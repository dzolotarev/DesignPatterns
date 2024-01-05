package com.example.patterns.behavioral.state.states;

import com.example.patterns.behavioral.state.ui.Player;

public class ReadyState extends State {

    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.setState(new LockedState(player));
        return "Locked...";
    }

    @Override
    public String onPlay() {
        player.setState(new PlayingState(player));
        return player.startPlayback();
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }
}
