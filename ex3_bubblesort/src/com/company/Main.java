package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();//inicjacja generatora

        int[] arr = new int[20]; //inicjacja tablicy

        for (int i = 0; i < arr.length; i++) {
            arr[i] = generator.nextInt();
            System.out.println(arr[i]);
        } //wypełnianie tablicy losowymi liczbami

        boolean sorted = false;
        while (sorted == false) {

            int temp; //bufor

            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sorted = true;
                }
            }//zamiana

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                }
            }//sprawdzanie
        }


        System.out.println("SORTED");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        } //wypisanie posortowanej tablicy


    }
}
