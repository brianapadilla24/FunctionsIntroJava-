package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Where are you from?");

        String location = scanner.nextLine();

        //s is for string f is for float d is for integer, remember the \n for a new line
        System.out.printf("Hello there, %s, and you are from %s\n", name, location);

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        //system.out.println("You are " +age + " years old");
        System.out.printf("You are %d years old ");



    }
}

public class Main {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        //math symbols are + - / = %
        int difference = firstNumber - secondNumber;
        int sum = firstNumber + secondNumber;
        int quotient = firstNumber / secondNumber;

        //modulus
        int modulus = secondNumber % firstNumber;

        int thirdNumber = 35;
        System.out.println(thirdNumber / secondNumber);

    }
}