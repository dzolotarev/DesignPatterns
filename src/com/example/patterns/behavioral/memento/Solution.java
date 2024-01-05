package com.example.patterns.behavioral.memento;

/* 
Memento mori
*/

public class Solution {

    public static void main(String[] args) {
        Notepad notepad = new Notepad(new TextWindow());
        notepad.write("Шаблон проектирования Хранитель.\n");
        notepad.write("Как его применять в Java?\n");
        notepad.save();

        notepad.write("Возьмите 300г муки, 0.5л молока и 2 яйца...\n");

        notepad.undo();

        System.out.println(notepad.print());
    }
}
