package com.company;

public class Main {

    public static void main(String[] args) {
	Student student = new Student("kowalski", 3, 4, 10);
	Uczen uczen = new Uczen("nowak", 3, 4);
        System.out.println(student.toString());
        System.out.println(uczen.toString());

    }
}
