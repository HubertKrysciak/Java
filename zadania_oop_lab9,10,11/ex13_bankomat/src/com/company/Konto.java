package com.company;

public class Konto {
    protected static float saldo;
    protected String imieWlasciciela;

    public Konto() {
        this.saldo = 10000;
        this.imieWlasciciela = "Hubert";
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getImieWlasciciela() {
        return imieWlasciciela;
    }
}
