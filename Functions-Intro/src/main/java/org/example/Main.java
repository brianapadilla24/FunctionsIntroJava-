package org.example;

public class Main {
    public static void greeting(String name) {
        System.out.println("Good morning!" + name + "!");
    }


    //we told the function that it always will return an int
    public static int checkNumber(int number){
        //not all code paths return a value
        //you are missing the return one of your conditions
        if(number > 0){
            return 1;
        }
        else if(number < 0){
            return -1;
        }
        else{
            return 0;
        }
    }
}