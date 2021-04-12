//Zadanie 2 (tablica2d + random + suma)


package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random generator = new Random();
        int suma = 0;
        int[][] tablica2d = new int[10][5];
        for(int i=0; i<tablica2d.length; i++){
            for(int j=0; j<tablica2d[i].length; j++){
                tablica2d[i][j] = generator.nextInt(20);
            }
        }

        for (int[] ints : tablica2d) {
            System.out.println("suma= " + suma);
            suma = 0;
            for (int j = 0; j < ints.length; j++) {
                suma += ints[j];
                System.out.print(ints[j] + " ");
            }
        }
        System.out.println("suma= " + suma);
    }
}
