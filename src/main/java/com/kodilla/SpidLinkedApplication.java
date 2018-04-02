package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

//@SpringBootApplication
public class SpidLinkedApplication {

    public static void main(String[] args) {
        LinkedList<Book>  ksiazki;
        ksiazki = new LinkedList<Book>();



        ksiazki.add(new Book("autor1","tytul1", 1990, 9, 21));
        ksiazki.add(new Book("autor2", "tytul2",1987,5,15));
        ksiazki.add(new Book("autor3","tytul3",1765,2,19));

        Random theGenarator = new Random();
        int liczba = 0;
        int liczjh = 0;
        String nautor = " ";
        String tytul = " ";
        for(int i=0; i<5; i++){
            liczba = theGenarator.nextInt(9);
            System.out.println(liczba);
            for(int e=0; e<liczba; e++){
                nautor =nautor + "autor ";
                System.out.println(nautor);
                tytul= tytul + "tytuł ";

                System.out.println(tytul);
     //           System.out.println(tytul.length());
                System.out.println(liczjh);
                liczjh = liczjh + liczba;
                System.out.println(liczjh);
            }
            ksiazki.add(new Book(nautor, tytul,1987,5,15));

            nautor="";
            tytul = "";


        }
        System.out.println("długość listy "+ksiazki.size());
        System.out.println("listy "+ksiazki);
    }
}
