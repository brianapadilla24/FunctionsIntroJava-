package org.example;

//we use constructors with everything we need from them
//any method can be overloaded
public class Book {
     private String title;
     private String author;
     private int pages;

     //make a constructor
    // take three argyment
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    //we  are going to overload the constructor, make another constructor
    // that looks real similar to the first but a little different
    /// takes 2 arguments
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.pages = 0;
    }

    //only use constructor bc we do not know author
    //you can only use one parameter with a string not more than 1
    //becasuse then the main folder will not know which one it will read

    public Book(String title) {
        this.title = title;
        this.author = "null";
        this.pages = 0;
    }

    //you can press generate, then constructor

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    //method signature:
    //public/private what it returns, the name, and parameters
    //display method
    public void displayInfo() {
        System.out.println("Book: " + this.getTitle() + "Author: " + this.getAuthor());

    }

    //little message before
    public void displayInfo(String prefix) {
        System.out.println("Book: " + this.getTitle() + "Author: " + this.getAuthor());


    }


}

//dot in the middle of the folder means package