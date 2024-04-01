package src._01_OurProjectTeam;

import java.util.Scanner;

public class _01_OurProjectTeam {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Scanner okuSayi = new Scanner(System.in);
        int max = 99;
        int min = 10;
        int rndSayi = (int) (Math.random() * (max - min)) + min;
        System.out.println("rndSayi = " + rndSayi);
        System.out.print("For easy press E ,For middle press M ,For difficult press D=");
        String secim = oku.next();
        switch (secim.toUpperCase()) {
            case "E": System.out.println("You have 10 guessing chance.");break;
            case "M": System.out.println("You have 7 guessing chance.");break;
            case "D": System.out.println("You have 5 guessing chance.");break;
            default: System.out.println("You made an incorrect entry!");break;}

        if (secim.equalsIgnoreCase("e")) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Guess a two-digit number.");
                int tahminSayi = okuSayi.nextInt();
                if (tahminSayi > rndSayi) {
                    System.out.println("Please enter a smaller number.");}
                if (tahminSayi < rndSayi) {
                    System.out.println("Please enter a larger number.");}
                if (tahminSayi == rndSayi) {
                    System.out.println("Congratulations! You guessed the correct number on " + " " + (i + 1) + ".try");break;}
                System.out.println("You have" + (9 - i) + " " + "guessing chance.");
                if (i == 9) {System.out.println("Sorry, you didn't guess the correct number on " + " " + (i + 1) + " " + "try , The computer's number=" + rndSayi);
                }
            }
        }
        if (secim.equalsIgnoreCase("m")) {
            for (int i = 0; i < 7; i++) {System.out.print("Guess a two-digit number=");
                int tahminSayi = okuSayi.nextInt();
                if (tahminSayi > rndSayi) {System.out.println("Please enter a smaller number.");}
                if (tahminSayi < rndSayi) {System.out.println("Please enter a larger number.");}
                if (tahminSayi == rndSayi) {System.out.println("Congratulations! You guessed the correct number on" + " " + (i + 1) + ".try");break;}
                System.out.println("You have" + (6 - i) + " " + "guessing chance.");
                if (i == 6) {System.out.println("Sorry, you didn't guess the correct number on" + " " + (i + 1) + " " + "try , The computer's number=" + rndSayi);
                }
            }
        }
        if (secim.equalsIgnoreCase("d")) {
            for (int i = 0; i < 5; i++) {System.out.print("Guess a two-digit number=");
                int tahminSayi = okuSayi.nextInt();
                if (tahminSayi > rndSayi) {System.out.println("Please enter a smaller number.");}
                if (tahminSayi < rndSayi) {System.out.println("Please enter a larger number.");}
                if (tahminSayi == rndSayi) {System.out.println("Congratulations! You guessed the correct number on" + " " + (i + 1) + ".try");break;}
                System.out.println("You have" + (4 - i) + " " + "guessing chance.");
                if (i == 4) {
                    System.out.println("Sorry, you didn't guess the correct number on" + " " + (i + 1) + " " + "try , The computer's number=" + rndSayi);
                }
            }
        }
    }
}


