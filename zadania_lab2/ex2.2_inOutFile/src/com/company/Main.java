package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main  {

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws FileNotFoundException {
        File file = new File(nazwaPlikWe);
        Scanner czyt = new Scanner(file);
        String[] arr = new String[1];
        List<String> lista = new ArrayList<String>();
        PrintWriter write = new PrintWriter(nazwaPlikWy);
        if (file.exists()) {
            while(czyt.hasNextLine()){
                lista.add(czyt.nextLine());
            }
            int wiersz = 1;
            for(int i = 0; i<lista.size(); i++){
                arr[0] = lista.get(i);
                if(arr[0].contains(slowo)){
                    write.println(wiersz + ". " + arr[0]);
                }
                wiersz++;
            }
            write.close();
        }
        else {
            System.out.println("Plik nie istnieje!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        szukaj("plik.txt", "plikwy.txt", "egzamin");
    }
}
