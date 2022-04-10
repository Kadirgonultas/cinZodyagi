package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dogumYili;

        System.out.println("Doğum Yılınızı giriniz : ");
        dogumYili = input.nextInt();

        dogumYili = dogumYili % 12;

        if (dogumYili == 0){
            System.out.println("Maymun");
        }

        if (dogumYili == 1){
            System.out.println("Horoz");
        }

        if (dogumYili == 2){
            System.out.println(" Köpek");
        }

        if (dogumYili == 3){
            System.out.println("Domuz");
        }

        if (dogumYili == 4){
            System.out.println("Fare");
        }

        if (dogumYili == 5){
            System.out.println(" Öküz");
        }

        if (dogumYili == 6){
            System.out.println("Kaplan");
        }

        if (dogumYili == 7){
            System.out.println("Tavşan");
        }

        if (dogumYili == 8){
            System.out.println("Ejderha");
        }

        if (dogumYili == 9){
            System.out.println("Yılan");
        }

        if (dogumYili == 10){
            System.out.println("At");
        }

        if (dogumYili == 11){
            System.out.println("Koyun");
        }else {
            System.out.println("Geçersiz bir yıl girdiniz");
        }

    }
}
