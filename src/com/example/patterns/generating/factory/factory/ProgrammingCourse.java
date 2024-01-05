package com.example.patterns.generating.factory.factory;

import com.example.patterns.generating.factory.developers.Developer;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public abstract class ProgrammingCourse {
    public abstract Developer createDeveloper();

    public void educateStudent() {
        createDeveloper().study();
    }
}
