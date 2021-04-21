package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void emerytura() throws FileNotFoundException, IOException{
        File plik = new File("dane.txt");
        Scanner scan = new Scanner(plik);
        BufferedWriter bw = new BufferedWriter(new FileWriter("kobiety.txt", true));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("mezczyzni.txt", true));
        List<String> dane = new ArrayList<String>();
        int i = 0;
        int ile = 0;
        String a = "M";
        String b = "K";
        while(scan.hasNextLine()){
            dane.add(scan.next());
            System.out.println(dane.get(i));
            i++;

            if(i == 4){
                if(a.equals(dane.get(2))){
                    ile = 65-Integer.parseInt(dane.get(3));
                    bw1.write(dane.get(0) + " " + dane.get(1) + " " + Integer.toString(ile) + "\n");
                    //bw1.close();
                }

                if(b.equals(dane.get(2))){
                    ile = 60-Integer.parseInt(dane.get(3));
                    bw.write(dane.get(0) + " " + dane.get(1) + " " + Integer.toString(ile) + "\n");
                    //bw.close();
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
