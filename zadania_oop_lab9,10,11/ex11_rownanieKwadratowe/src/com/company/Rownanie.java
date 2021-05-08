package com.company;

import jdk.dynalink.StandardNamespace;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rownanie {
    private static float a;
    private static float b = 0;
    private static float c;
    private static double x1;
    private static double x2;
    private static double x0;
    private static double delta;


    public static void czytaj_dane(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();
    }

    private static  void przetworz_dane(){
        DecimalFormat dec = new DecimalFormat("#0.00");
        delta = pow(b, 2) - (4 * a * c);
        int i = 0;
        if(delta == 0){
            i = 0;
        }else if(delta > 0){
            i = 1;
        }else if(delta < 0){
            i = -1;
        }

        switch (i){
            case 0:
                x0 = -b/(2*a);
                System.out.println("x0 = " + dec.format(x0));
                break;
            case 1:
                x1 = (-b + sqrt(delta))/(2*a);
                x2 = (-b - sqrt(delta))/(2*a);
                System.out.println("x1 = " + dec.format(x1));
                System.out.println("x2 = " + dec.format(x2));
                break;
            case -1:
                System.out.println("Brak pierwiastków");
                break;
        }

    }

    public static void wyswietl_wynik(){
        DecimalFormat dec = new DecimalFormat("#0.00");

        System.out.println("a = " + dec.format(a));
        System.out.println("b = " + dec.format(b));
        System.out.println("c = " + dec.format(c));
        przetworz_dane();

    }

}
