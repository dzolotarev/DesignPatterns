package com.example.patterns.generating.factory.factory;

import com.example.patterns.generating.factory.developers.Developer;
import com.example.patterns.generating.factory.developers.DotNetDeveloper;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public class DotNetCourse extends ProgrammingCourse {
    @Override
    public Developer createDeveloper() {
        return new DotNetDeveloper();
    }

    @Override
    public void educateStudent() {
        super.educateStudent();
    }
}
