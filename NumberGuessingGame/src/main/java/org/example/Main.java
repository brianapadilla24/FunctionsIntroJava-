package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = 35;
        System.out.println("Guess my hidden number!");
        Scanner scanner = new Scanner(System.in);

        int guess = scanner.nextInt();
    // >, < >=, <=, ==, !=
        //part inside the parenthesis is the condition
        if(guess > number){
            System.out.println("You guessed to high.");
        }
        else if(guess < number){
            System.out.println("You guessed to low.");
        }
        else {
            System.out.println("Winner! ");
        }
    }
}