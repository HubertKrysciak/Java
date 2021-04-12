package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[20];
        int[] hmr = new int[20];
        int[] wypsane = new int[20];
        Random generator = new Random();

        System.out.println("TABLICA:");
        int i = 0;
        while(i < array.length){
            array[i] = generator.nextInt(10)+1;
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println(" ");

        for(i = 0; i<array.length; i++){
            int reps=0;
            for(int j = 0; j<array.length; j++){
                if(array[i]==array[j]){
                    reps++;
                }
            }
            hmr[i] = reps;
        }



        for(i=0; i<array.length; i++){
            boolean czybyło = false;
            for(int j = 0; j<wypsane.length; j++){
                if(array[i]==wypsane[j])
                    czybyło=true;
            }

            if(czybyło == false){
            System.out.println("CYFRA: " + array[i] + " powtarza się: " + hmr[i] + " razy");
            wypsane[i]=array[i];
            }
        }
    }
}
