package com.company;

public class Rower extends Pojazdy{
    private int iloscKol;
    private String typ;

    public Rower(String nazwa, String energiaNapedowa, int iloscKol, String typ) {
        super(nazwa, energiaNapedowa);
        this.iloscKol = iloscKol;
        this.typ = typ;
    }

    @Override
    protected void jazda() {
        super.jazda();
        System.out.println("rower");
    }
}
