package com.company;

import java.util.Random;

public class Main {

    static int min(int[] args){ //ZNAJDUJE MINIMALNĄ WARTOŚĆ
        int buffer = args[0];
        for(int i = 1; i < args.length; i++){
            if(args[i]<buffer){
                buffer = args[i];
            }
        }
        return buffer;
    }

    static int max(int[] args){ //ZNAJDUJE MAKSYMALNĄ WARTOŚĆ
        int buffer = args[0];
        for(int i = 1; i < args.length; i++){
            if(args[i]>buffer){
                buffer = args[i];
            }
        }
        return buffer;
    }

    static float avg(int[] args){ //ŚREDNIA
        float buffer = args[0];
        int i = 0;
        while(i < args.length){
            buffer += args[i];
            i++;
        }
        return buffer/args.length;
    }

    static int[] hol(int[] args){
        int i = 0;
        int h = 0;
        int l = 0;
        while(i<args.length){
            if(args[i]>(int)avg(args))
                h++;
            else
                l++;
            i++;
        }
        int[] values = new int[2];
        values[0]=h;
        values[1]=l;
        return values;
    }

    public static void main(String[] args) {

        int [] array = new int[10]; //DEKLARACJA TABLICY
        Random generator = new Random();

        for (int i = 0; i<array.length; i++){ // WYPEŁNIENIE TABLICY DANYMI
            array[i] = (generator.nextInt())%11;
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        System.out.println("minimum = " + min(array));
        System.out.println("maksimum = " + max(array));
        System.out.println("średnia = " + avg(array));
        int[] tab = new int[2];
        tab = hol(array);
        System.out.println("większych od średniej = " + tab[0]);
        System.out.println("mniejszych od średniej = " + tab[1]);

        int i = array.length-1;
        while(i>=0){
            System.out.print(array[i] + " ");
            i--;
        }

    }
}
