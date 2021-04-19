package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("plik.txt", true));
        Scanner scanner = new Scanner(new File("plik.txt"));

        int buff = 0;
        while (scanner.hasNextLine()) {
            buff += scanner.nextInt();
        }
        scanner.close();
        System.out.println(buff);
        String s = String.valueOf(buff);
        String z = String.valueOf(buff+1);

        if (buff == 0) {
            bw.write(z);
            bw.close();
        }else{
            bw.append("\n" + s);
            bw.close();
        }

    }
}
