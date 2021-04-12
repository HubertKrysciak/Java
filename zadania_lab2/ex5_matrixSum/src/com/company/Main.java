package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int [][] arr1 = new int[4][4];
        int [][] arr2 = new int[4][4];
        int [][] arr3 = new int[4][4];

        Random generator = new Random();

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = generator.nextInt(100);
                arr2[i][j] = generator.nextInt(100);
            }
        }

        System.out.println("Macierz 1");

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print((arr1[i][j]) + " ");
            }
            System.out.println("");
        }//arr1

        System.out.println("");
        System.out.println("Macierz 2");

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print((arr2[i][j]) + " ");
            }
            System.out.println("");
        }//arr2

        System.out.println("");
        System.out.println("Macierz 3");

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print((arr3[i][j] = arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println("");
        }//arr3

    }
}
