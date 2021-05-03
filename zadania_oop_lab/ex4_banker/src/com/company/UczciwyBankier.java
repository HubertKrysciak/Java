package com.company;

public class UczciwyBankier extends Bankier{

    public UczciwyBankier(String imie) {
        super(imie);
    }

    @Override
    public float licz(float a, float b) {
        return a+b;
    }
}
