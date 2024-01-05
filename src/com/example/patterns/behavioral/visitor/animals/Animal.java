package com.example.patterns.behavioral.visitor.animals;

import com.example.patterns.behavioral.visitor.visitor.Visitor;

public abstract class Animal {

    public abstract String getName();

    public abstract String accept(Visitor visitor);
}
