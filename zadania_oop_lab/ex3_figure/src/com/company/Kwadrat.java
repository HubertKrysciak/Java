package com.company;

public class Kwadrat extends Figura {

    public Kwadrat(int dlugosc) {
        super(dlugosc);
    }

    @Override
    protected void rysuj() {
        super.rysuj();
        System.out.println("Rysuję kwadrat");
    }
}
