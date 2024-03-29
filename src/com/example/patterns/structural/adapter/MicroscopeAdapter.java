package com.example.patterns.structural.adapter;

/**
 * Created by Denis Zolotarev on 31.10.2023.
 */
public class MicroscopeAdapter extends Hammer{
    private Microscope microscope;

    public MicroscopeAdapter(Microscope microscope) {
        this.microscope = microscope;
    }

    @Override
    public boolean hit(Nail nail) {
        microscope.bang();
        return false;
    }
}
