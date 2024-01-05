package com.example.patterns.behavioral.visitor.visitor;

import com.example.patterns.behavioral.visitor.animals.Cat;
import com.example.patterns.behavioral.visitor.animals.Cow;
import com.example.patterns.behavioral.visitor.animals.Dog;

public interface Visitor {
    String visitCat(Cat cat);

    String visitDog(Dog dog);

    String visitCow(Cow cow);
}
