package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    List<String> groceryList = new ArrayList<>();

    groceryList.add("Peanut Butter");
    groceryList.add("Ice cream");
    groceryList.add("Sugar");
    groceryList.add("Cereal");


    groceryList.remove("Peanut Butter");

    //remember, index starts at 0 and then 1
    System.out.println(groceryList.get(1));

    //how many things in it
        System.out.println(groceryList.size());

        //loops
        for(String groceryItem : groceryList){

            System.out.println(groceryItem);
        }



        //this way is better
        List<String> fruits = new ArrayList<>(Arrays.asList("Banana", "Strawberry", "Mango", "Apricot", "Kumquat"));

       //another way
        List<String> fruits2 = new ArrayList<>(List.of("Banana", "Strawberry", "Mango", "Apricot", "Kumquat"));




    }
}

//arrays capped in terms in size: once I say theres 4 elements in this array theres 4
//arrays are sometimes too rigid
//the more flexible version of an array is called an array list: can be resized
//Use classes not primitives
//use a capital ex String, no primitives, ONLY classes or objects
//array list starts with nothing in it
//remember, array lists have index starts at 0
//ex icecream became 0 and sugar became 1
//collections of data structures built in to java
//fixed number = used an array
//when you serialize or deserialize you are going to need an array list
//read the file line by line and deserialize each line into an object




//EXAMPLE OF A CSV FILE: 1|Laptop|999.99|Electronics
//pipe delimeted or comma
//financial - pipe delimeted
//ID, Name, Price, Category
//2|Smartphone|699.99|Electronics
//3|Blender|49.99|Appliances
//4|T-Shirt|15.99|Apparel
//5|Coffee Maker|89.99|Appliances
