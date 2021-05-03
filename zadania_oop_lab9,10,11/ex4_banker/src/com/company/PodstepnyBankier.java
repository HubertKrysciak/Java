package com.company;

public class PodstepnyBankier extends Bankier {

    public PodstepnyBankier(String imie) {
        super(imie);
    }

    @Override
    protected float licz(float a, float b) {
        return 0.8f*(a+b);
    }
}
