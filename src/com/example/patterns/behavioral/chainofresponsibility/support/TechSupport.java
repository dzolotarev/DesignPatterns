package com.example.patterns.behavioral.chainofresponsibility.support;

import java.util.Objects;

public abstract class TechSupport {
    private TechSupport nextLevel;

    public TechSupport setNextLevel(TechSupport nextLevel) {
        this.nextLevel = nextLevel;
        return nextLevel;
    }

    protected void passAlongTheChain(String problem) {
        if (Objects.nonNull(nextLevel)) {
            nextLevel.solve(problem);
        }
    }

    public abstract void solve(String problem);
}
