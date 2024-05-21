package org.example;


//exceptions happen when you tell tge computer to do something you cannot do

//of we cannot divide by 0 then the computer cannot divide y 0
//compile time erros: time error generally refers to the errors that correspond to the semantics or syntax.
//because the computer only knows binary code
//run time errors: he error that we encounter during the code execution during runtime
//happens when the program is running

//defensive programming - write a codde that the percentage of runtime exception is lower to nothing
//use ris their existance is to give us bad data, and we are going to write our program defensively so that
//even the program still runs
public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        System.out.println("The program has started");
        //any code you could possibily think might have a runtime error, you put in the try block

        try {
            System.out.println("Division: " + (a/b));
        }
        //no exception, just moves on
        catch(Exception ex) {
            //if exception is thrown it will look at the code inside of here
            System.out.println("Sorry can't divide by zero!");
        }

        System.out.println("Does this statement print out?");
    }
    //you have to think how does this code could go wrong
    //better be safe than sorry
    //an exception is an error the computer can not run the code
    //something that is impossible

}