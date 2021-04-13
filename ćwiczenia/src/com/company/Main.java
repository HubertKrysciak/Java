package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("doc.txt");
        zapis.println("Cwiczę sobie jave");
        zapis.close();

        File pliczek = new File("doc.txt");
        Scanner czytaj = new Scanner(pliczek);
        System.out.println(czytaj.nextLine());
    }
}
