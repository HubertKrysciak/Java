package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Osobowy / Autobus ?");
        String wybor = scanner.next();
        if(wybor.equals("Osobowy")){
            new Osobowy().jazda();
        }else if(wybor.equals("Autobus")){
            new Autobus().jazda();
        }
    }
}
