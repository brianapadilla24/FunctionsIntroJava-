package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //have computer open file
        //take data and stream it
        //if you see file
       try {

           //open file
           //src/main/resources/fileName
           FileInputStream fileInputStream = new FileInputStream("src/main/resources/yeats-poem.txt");
           //we're going to stream the file to the scanner

           //read context
           Scanner scanner = new Scanner(fileInputStream);
           //place holder variable
           String input;

           //while loop - do it until i tell you to stop
           while (scanner.hasNextLine()){
               input = scanner.nextLine();
               System.out.println(input);
           }

           scanner.close();


       }
       catch(FileNotFoundException ex){
           System.out.println("File not found ");

    }
} }

//scanner for something new
//resource folder - any soft of file that your program needs to run
//resource folder - static files
//checked exceptions - you have no choice but to do try catch
//security excpetion - not checked, file not secured
//a buffer breaks it into parts
//permanance - something permanent
//bigger things like banks/shopping do not use files, they use databases


