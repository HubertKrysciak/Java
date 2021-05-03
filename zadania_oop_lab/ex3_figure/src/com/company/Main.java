package com.company;

public class Main {

    public static void main(String[] args) {
	    Figura[] tablica = new Figura[5];
	    tablica[0] = new Figura(5);
	    tablica[1] = new Figura(4);
	    tablica[2] = new Linia(7);
	    tablica[3] = new Kwadrat(5);
	    tablica[4] = new Kwadrat(5);


	    tablica[4].rysuj();

    }
}
