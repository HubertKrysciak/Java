package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void emerytura() throws FileNotFoundException, IOException{
        File plik = new File("dane.txt");
        Scanner scan = new Scanner(plik);
        PrintWriter bwclean = new PrintWriter("kobiety.txt");//czyszczenie pliku txt
        PrintWriter bw1clean = new PrintWriter("mezczyzni.txt");//czyszczenie pliku txt
        BufferedWriter bw = new BufferedWriter(new FileWriter("kobiety.txt", true));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("mezczyzni.txt", true));
        List<String> dane = new ArrayList<String>();
        int i = 0;
        int ile = 0;
        String a = "M";
        String b = "K";
        bwclean.write("");
        bw1clean.write("");
        while(scan.hasNextLine()){
            dane.add(scan.next());
            System.out.println(dane.get(i));
            i++;

            if(i == 4){
                if(a.equals(dane.get(2))){
                    ile = 65-Integer.parseInt(dane.get(3));
                    bw1.write(dane.get(0) + " " + dane.get(1) + " " + Integer.toString(ile) + "\n");
                }

                if(b.equals(dane.get(2))){
                    ile = 60-Integer.parseInt(dane.get(3));
                    bw.write(dane.get(0) + " " + dane.get(1) + " " + Integer.toString(ile) + "\n");
                }
                i=0;
                dane.removeAll(dane);
            }
        }
        bw.close();
        bw1.close();

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {
        emerytura();
    }
}
