package org.example;

import java.util.Scanner;

//functions receive data called parameters/arguments
//functions take in data
//functions can output/return data
//DRY Principle = Dont repeat yourself
public class Main {

    //static functions stay in a group
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, please give me two numbers to add together: ");
        System.out.println("First number please: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Second number please: ");
        int secondNumber = scanner.nextInt();

        //calling/invoke the addTwoNumber function
        //two parameters, two arguments

        int sum = addTwoNumbers(firstNumber, secondNumber);
        System.out.println("The sum is: " + sum);

    }

//method
    //for right now method is public, static so that they can match, int because we are givingn back an
    //integer. addTwoNumbers is the function
    //then you return the sum
    //code smell, having a lot of lines of code
// if you function doestn return anything you are going to use void

    public static int addTwoNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        return sum;
    }
}