package com.company;

public class Pudelko {

    protected int szerokosc;
    protected int dlugosc;
    protected int wysokosc;

    public Pudelko(int szerokosc, int dlugosc, int wysokosc) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.wysokosc = wysokosc;
    }

    public Pudelko(int zmienna){
        this.szerokosc = zmienna;
        this.dlugosc = zmienna;
        this.wysokosc = zmienna;
    }

    public int objetosc() {
        return szerokosc * dlugosc * wysokosc;
    }

    public String toString() {
        return szerokosc + " " + dlugosc + " " + wysokosc + " " + objetosc();

    }
}