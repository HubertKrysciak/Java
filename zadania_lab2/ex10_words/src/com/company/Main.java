package com.company;

public class Main {

    public static void hvb(String[] words){
        for(int i = 0; i< words.length; i++){
            String buff = words[i];
            for(int j = 0; j<buff.length();j++) {
                if (buff.charAt(j) == 'b'){
                    System.out.println(buff);
                    break;
                }
                if(buff.charAt(buff.length()-1) == 'a'){
                    System.out.println(buff);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"slowo", "word", "kompbbbubbter", "laptop", "biurko", "telefon", "bułka"};
        hvb(words);
    }
}