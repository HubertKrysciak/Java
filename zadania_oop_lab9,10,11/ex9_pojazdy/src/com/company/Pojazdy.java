package com.company;

public abstract class Pojazdy {
    protected String nazwa;
    protected String energiaNapedowa;

    public Pojazdy(String nazwa, String energiaNapedowa) {
        this.nazwa = nazwa;
        this.energiaNapedowa = energiaNapedowa;
    }

    protected void jazda(){
        System.out.print("Jedzie ");
    }
}
