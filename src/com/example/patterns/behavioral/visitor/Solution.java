package com.example.patterns.behavioral.visitor;

/* 
Шерсть и звезды
*/

import com.example.patterns.behavioral.visitor.animals.Cat;
import com.example.patterns.behavioral.visitor.animals.Cow;
import com.example.patterns.behavioral.visitor.animals.Dog;
import com.example.patterns.behavioral.visitor.visitor.JsonExportVisitor;
import com.example.patterns.behavioral.visitor.visitor.YamlExportVisitor;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Cat().accept(new JsonExportVisitor()));
        System.out.println(new Cow().accept(new JsonExportVisitor()));
        System.out.println(new Dog().accept(new JsonExportVisitor()));

        System.out.println(new Cat().accept(new YamlExportVisitor()));
        System.out.println(new Cow().accept(new YamlExportVisitor()));
        System.out.println(new Dog().accept(new YamlExportVisitor()));
    }
}
