package com.example.patterns.behavioral.chainofresponsibility;

import com.example.patterns.behavioral.chainofresponsibility.support.*;

public class CRM {

    private TechSupport techSupport;

    public CRM() {
        this.techSupport = new CallCenter();
        this.techSupport
                .setNextLevel(new HelpDesk())
                .setNextLevel(new SysAdmin())
                .setNextLevel(new ITDirector());
    }

    public void register(String problem) {
        System.out.println(problem);
        techSupport.solve(problem.trim().toLowerCase());
    }
}
