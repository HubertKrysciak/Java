package com.company;

public class Wplata extends Konto{
    public Wplata() {
    }

    @Override
    public void setSaldo(float kwota) {
        super.setSaldo(super.getSaldo()+kwota);
    }
}
