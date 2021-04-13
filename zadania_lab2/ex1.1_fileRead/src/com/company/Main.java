package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File pliczek = new File("plik.txt");
        Scanner czytak = new Scanner(pliczek);
        Scanner czytSlowa = new Scanner(pliczek);
        List <String> lista = new ArrayList<String>();
        List <String> slowa = new ArrayList<String>();
        int howManyChars = 0;
        int howManyWhiteSpaces = 0;

        while(czytak.hasNextLine()){
            lista.add(czytak.nextLine());
        }

        while (czytSlowa.hasNext()){
            slowa.add(czytSlowa.next());
        }

        for(int i = 0; i < lista.size(); i++){
            howManyChars += lista.get(i).length();
            String temp = lista.get(i);
            for(int j = 0; j < temp.length(); j++) {
                if (Character.isWhitespace(temp.charAt(j))) {
                    howManyWhiteSpaces++;
                }
            }

        }

        int[] arr = {howManyChars, howManyWhiteSpaces, slowa.size()};
        System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);

    }
}
