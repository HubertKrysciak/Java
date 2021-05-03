package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, NoSuchElementException {
        List<Produkty> produkty = new ArrayList<Produkty>();
        Scanner scanner = new Scanner(System.in);

        int wybor = 9;
        int ktoryusunac;
        String var1;
        String var2;
        int var3;

        System.out.println("Co chcesz zrobić?");
        System.out.println(" ");
        System.out.println("Jeżeli chcesz dodać produkt, wciśnij 1");
        System.out.println("Jeżeli chcesz wyświetlić produkty, wciśnij 2");
        System.out.println("Jeżeli chcesz usunąć produkty, wciśnij 3");
        System.out.println("Jeżeli chcesz posortować produkty wg nazwy, wciśnij 4");
        System.out.println("Jeżeli chcesz zapisać produkty do pliku, wciśnij 5");
        System.out.println("Jeżeli chcesz usunąć wszystkie produkty z pliku, wciśnij 6");
        System.out.println("Jeżeli chcesz załadować produkty z pliku, wciśnij 7");
        System.out.println("Jeżeli chcesz zmienić globalnie cenę, wciśnij 8");

        while (wybor != 0) {
            wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    System.out.println("Podaj typ, nazwę i cenę, każde zatwierdź enterem");
                    var1 = scanner.next();
                    var2 = scanner.next();
                    var3 = scanner.nextInt();
                    produkty.add(new Produkty(var1, var2, var3));
                    System.out.println("Dodano");
                    continue;


                case 2:
                    if(produkty.size() == 0){
                        System.out.println("Brak produktów!");
                    } else {
                        for (int i = 0; i < produkty.size(); i++)
                            System.out.println(produkty.get(i).getType() + " " + produkty.get(i).getName() + " " + produkty.get(i).getPrice());
                    };
                    continue;

                case 3:
                    if(produkty.size() != 0) {
                        for (int i = 0; i < produkty.size(); i++)
                            System.out.println(i + "." + " " + produkty.get(i).getType() + " " + produkty.get(i).getName() + " " + produkty.get(i).getPrice());
                        System.out.println("Który produkt chcesz usunąć? Podaj jego cyfrę");
                        ktoryusunac = scanner.nextInt();
                        produkty.remove(ktoryusunac);
                        for (int i = 0; i < produkty.size(); i++)
                            System.out.println(i + "." + " " + produkty.get(i).getType() + " " + produkty.get(i).getName() + " " + produkty.get(i).getPrice());
                        System.out.println("Usunięto");
                    }else{
                        System.out.println("Brak produktów do usunięcia!");
                    };
                    continue;

                case 4:
                    if(produkty.size() != 0) {
                        Collections.sort(produkty);
                        for (Produkty x : produkty) {
                            System.out.println(x.getType() + " " + x.getName() + " " + x.getPrice());
                        }
                    }else{
                        System.out.println("Brak produktów do sortowania!");
                    }
                    continue;

                case 5:
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("produkty.txt", true)));
                    for (Produkty x: produkty) {
                        out.println(x.getType() + " " + x.getName() + " " + x.getPrice());
                    }
                    out.close();

                    if(produkty.size() == 0){
                        PrintWriter writer = new PrintWriter("produkty.txt");
                        writer.print("");
                        writer.close();
                    }
                    continue;

                case 6:
                    PrintWriter writer = new PrintWriter("produkty.txt");
                    writer.print("");
                    writer.close();
                    continue;

                case 7:
                    File plik = new File("produkty.txt");
                    Scanner odczyt = new Scanner(plik);
                    if(plik.exists() && odczyt.hasNext()) {
                        while(odczyt.hasNext()) {
                            var1 = odczyt.next();
                            var2 = odczyt.next();
                            var3 = odczyt.nextInt();
                            produkty.add(new Produkty(var1, var2, var3));
                        }
                    }
                    continue;

                case 8:
                    System.out.println("Procentowo czy Kwotowo? P/K");
                    String w = scanner.next();
                    if(w.equals("P") || w.equals("p")){
                        System.out.println("O jaki procent zmienić cenę?");
                        int proc = scanner.nextInt();
                        for (Produkty x: produkty) {
                            x.setPrice(x.getPrice() + (x.getPrice()*proc/100));
                        }
                    }
                    continue;
            }

        }
    }
}

