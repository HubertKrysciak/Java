package com.company;

public class Linia extends Figura {

    public Linia(int dlugosc) {
        super(dlugosc);
    }

    @Override
    protected void rysuj() {
        super.rysuj();
        System.out.println("Rysuję linię");
    }
}
