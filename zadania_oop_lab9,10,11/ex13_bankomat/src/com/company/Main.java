package com.company;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Konto konto = new Konto();
        CheckSaldo sprawdz = new CheckSaldo();
        Wplata wplac = new Wplata();
        Wyplata wyplac = new Wyplata();
        Potwierdzenie potwierdzenie = new Potwierdzenie();
        int i = 1000;
        float kwota;

        System.out.println("Witamy w BANKU ŚLĄSKIM");
        System.out.println("1 - sprawdź saldo");
        System.out.println("2 - wpłata");
        System.out.println("3 - wypłata");


        while(i != 0) {
            i = scanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Stan twojego konta to: " + sprawdz.getSaldo());
                    break;
                case 2:
                    System.out.println("Wpisz kwotę");
                    kwota = scanner.nextFloat();
                    wplac.setSaldo(kwota);
                    System.out.println("Czy chcesz otrzymać potwierdzenie?");
                    String wybor = scanner.next();
                    if(wybor == "tak" || wybor == "TAK"){
                        potwierdzenie.potwierdz();
                    }
                    break;
                case 3:
                    System.out.println("Wpisz kwotę");
                    kwota = scanner.nextFloat();
                    wyplac.setSaldo(kwota);
                    break;
            }
        }
    }
}
