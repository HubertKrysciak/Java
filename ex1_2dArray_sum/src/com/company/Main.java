//Zadanie 1 (tablica 2 wymiarowa + suma)

package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] tablica2d = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int suma = 0;
        for(int i = 0; i<tablica2d.length; i++) {
            for(int j = 0; j<tablica2d[i].length; j++){
                suma += tablica2d[i][j];
            }
        }
        System.out.println(suma);
    }
}
