package com.company;

public class Auto extends Pojazdy{
    private int iloscDrzwi;
    private int waga;

    public Auto(String nazwa, String energiaNapedowa, int iloscDrzwi, int waga) {
        super(nazwa, energiaNapedowa);
        this.iloscDrzwi = iloscDrzwi;
        this.waga = waga;
    }

    @Override
    protected void jazda() {
        super.jazda();
        System.out.println("samochod");
    }
}
