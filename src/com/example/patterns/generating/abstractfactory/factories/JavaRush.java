package com.example.patterns.generating.abstractfactory.factories;

import com.example.patterns.generating.abstractfactory.juniors.JavaJunior;
import com.example.patterns.generating.abstractfactory.juniors.JuniorDeveloper;
import com.example.patterns.generating.abstractfactory.middles.JavaMiddle;
import com.example.patterns.generating.abstractfactory.middles.MiddleDeveloper;
import com.example.patterns.generating.abstractfactory.seniors.JavaSenior;
import com.example.patterns.generating.abstractfactory.seniors.SeniorDeveloper;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public class JavaRush implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}
