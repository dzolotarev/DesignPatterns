package com.example.patterns.generating.abstractfactory.factories;

import com.example.patterns.generating.abstractfactory.juniors.JuniorDeveloper;
import com.example.patterns.generating.abstractfactory.juniors.PythonJunior;
import com.example.patterns.generating.abstractfactory.middles.MiddleDeveloper;
import com.example.patterns.generating.abstractfactory.middles.PythonMiddle;
import com.example.patterns.generating.abstractfactory.seniors.PythonSenior;
import com.example.patterns.generating.abstractfactory.seniors.SeniorDeveloper;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public class PythonCourse implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new PythonJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}
