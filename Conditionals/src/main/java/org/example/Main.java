package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String favoriteColor = "Purple";

        System.out.println("What do you think is my favorite color?");


        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        //conditional
        if(result.equalsIgnoreCase(favoriteColor)) {
            System.out.println("Yes! Purple is my favorite color!");

        }
        else {
            System.out.println("Sorry better luck next time!");
        }
    }

}