package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Prostokat {
    private static double a;
    private static double b;
    private static double pole;

    public static void czytaj_dane(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();

    }

    private static double przetworz_dane(){
         return a*b;
    }

    public static void wyswietl_wynik(){
        DecimalFormat dec = new DecimalFormat("#0.00");
        pole = przetworz_dane();
        System.out.println("a = " + dec.format(a));
        System.out.println("b = " + dec.format(b));
        System.out.println("pole = " + dec.format(pole));
    }

}
