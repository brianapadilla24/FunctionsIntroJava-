package org.example;
//conditionals are is it true or is it false

public class Main {
    public static void main(String[] args) {
        double temp = 67.5;
        String weatherCondition = "sunny";

        if (temp > 50 && weatherCondition.equals("sunny")) {
            System.out.println("Perfect day for a picnic!");
        }

        // great weather for a walk if condition is sunny or overcast
        else if (weatherCondition.equals("Sunny") || weatherCondition.equals("overcast")){
                System.out.println("Fine time to take a walk!");
            }
        else if(temp < 0 && weatherCondition.equals("snowy")){
                System.out.println("Build a snowman!");
            }
        //fanciness
        //if the temperature is between 50 and 65 inclusive and its either sunny or cloudy
        else if((temp <= 65 && temp >= 50) && weatherCondition.equals("sunny")
        || weatherCondition.equals("cloudy")){
            System.out.println("The temperature is between 50 and 65, AND its either sunny or cloudy");

        }
    }
}