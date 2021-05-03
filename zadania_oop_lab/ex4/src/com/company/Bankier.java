package com.company;

public abstract class Bankier {

    private String imie;

    public Bankier(String imie) {
        this.imie = imie;
    }

    protected abstract float licz(float a, float b);
}
