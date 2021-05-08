package com.company;


import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Potwierdzenie extends Konto{
    PrintWriter zapis = new PrintWriter("potwierdzenie.txt");

    public Potwierdzenie() throws FileNotFoundException {
    }

    public void potwierdz () {
        zapis.println("potwierdzenie operacji");
//        zapis.println(super.getImieWlasciciela());
//        zapis.println("Saldo po operacji: " + super.getSaldo());
        zapis.close();
    }

}
