package com.company;

public class Uczen {
    protected String nazwisko;
    protected float ocena1;
    protected float ocena2;

    public Uczen(String nazwisko, int ocena1, int ocena2){
        this.nazwisko = nazwisko;
        this.ocena1 = ocena1;
        this.ocena2 = ocena2;
    }

    public float srednia(){
        return (ocena1+ocena2)/2;
    }

    public String toString(){
        return nazwisko + srednia();
    }


}
