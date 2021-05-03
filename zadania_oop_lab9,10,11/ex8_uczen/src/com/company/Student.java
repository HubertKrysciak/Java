package com.company;

public class Student extends Uczen{
    private int waga1;

    public Student(String nazwisko, int ocena1, int ocena2, int waga1) {
        super(nazwisko, ocena1, ocena2);
        this.waga1 = waga1;
    }

    @Override
    public float srednia() {
        return (((ocena1*waga1)+(ocena2*waga1))/(2*waga1));
    }

    @Override
    public String toString() {
        return nazwisko + srednia();
    }
}
