package com.company;

public class Wyplata extends Konto{
    public Wyplata() {
    }

    @Override
    public void setSaldo(float kwota) {
        super.setSaldo(super.getSaldo()-kwota);
    }
}

