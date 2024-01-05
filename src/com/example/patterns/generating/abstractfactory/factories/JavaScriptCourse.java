package com.example.patterns.generating.abstractfactory.factories;

import com.example.patterns.generating.abstractfactory.juniors.JavaScriptJunior;
import com.example.patterns.generating.abstractfactory.juniors.JuniorDeveloper;
import com.example.patterns.generating.abstractfactory.middles.JavaScriptMiddle;
import com.example.patterns.generating.abstractfactory.middles.MiddleDeveloper;
import com.example.patterns.generating.abstractfactory.seniors.JavaScriptSenior;
import com.example.patterns.generating.abstractfactory.seniors.SeniorDeveloper;

/**
 * Created by Denis Zolotarev on 03.11.2023.
 */
public class JavaScriptCourse implements DeveloperCourse {
    @Override
    public JuniorDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    @Override
    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    @Override
    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}
