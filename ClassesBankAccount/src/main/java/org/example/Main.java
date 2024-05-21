package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        BankAccount newAccount = new BankAccount (100, "Briana");

        newAccount.deposit(150);
        newAccount.withdraw(50);
    }
}