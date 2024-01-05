package com.example.patterns.generating.factory.factory;

import com.example.patterns.generating.factory.developers.Developer;
import com.example.patterns.generating.factory.developers.JavaDeveloper;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public class JavaRush extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public void educateStudent() {
        super.educateStudent();
    }
}
