package com.company;

public class Main {

    public static void main(String[] args) {
        long[] fibo = new long[50];
        fibo[0] = 1;
        fibo[1] = 1;
        for(int i = 2; i<fibo.length; i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        int i = 0;
        while(i< fibo.length){
            System.out.println(fibo[i]);
            i++;
        }
    }
}
