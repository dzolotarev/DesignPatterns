package com.example.patterns.generating.factory;

import com.example.patterns.generating.factory.factory.DotNetCourse;
import com.example.patterns.generating.factory.factory.JavaRush;
import com.example.patterns.generating.factory.factory.KotlinCourse;
import com.example.patterns.generating.factory.factory.ProgrammingCourse;

/*
Кузница кадров
*/

public class Solution {

    private static ProgrammingCourse course;

    public static void main(String[] args) {
        choose("android");
        startLearningProcess();
    }

    static void choose(String direction) {
        if (direction.equals("web")) {
            course = new JavaRush();
        } else if (direction.equals("android")) {
            course = new KotlinCourse();
        } else {
            course = new DotNetCourse();
        }
    }

    static void startLearningProcess() {
        course.educateStudent();
    }
}
