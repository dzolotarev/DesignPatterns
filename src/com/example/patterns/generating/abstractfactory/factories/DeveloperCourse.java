package com.example.patterns.generating.abstractfactory.factories;

import com.example.patterns.generating.abstractfactory.juniors.JuniorDeveloper;
import com.example.patterns.generating.abstractfactory.middles.MiddleDeveloper;
import com.example.patterns.generating.abstractfactory.seniors.SeniorDeveloper;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public interface DeveloperCourse {
    JuniorDeveloper createJunior();

    MiddleDeveloper createMiddle();

    SeniorDeveloper createSenior();
}
