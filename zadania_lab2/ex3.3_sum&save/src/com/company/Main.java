package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pisz = new PrintWriter("plik.txt");
        pisz.println(1);
        pisz.close();
    }
}
