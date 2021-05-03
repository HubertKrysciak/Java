package com.company;

public class Main {

    public static void main(String[] args) {
        Bankier bankier1 = new UczciwyBankier("Jan");
        Bankier bankier2 = new PodstepnyBankier("Pawel");
        System.out.println(bankier1.licz(4,5));
        System.out.println(bankier2.licz(4,5));
    }
}
