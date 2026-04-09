package com.pluralsight;

import static java.lang.Boolean.TRUE;

public class VariableApp {

// exercise 1
    public static void main(String[] args) {
        String favoriteColor = "Red";
        System.out.println("My favorite color is " + favoriteColor);

        short yearStartedProgram = 2026;
        System.out.println("I started Year up United in " + yearStartedProgram);

        char middleInital = 'A';
        System.out.println("My middle inital is " + middleInital);

        String havePets = "yes";
        System.out.println("Do you have any pets? "+ havePets);

        String niceMessage = "Lo bueno siempre va ser dificil, pero todo siempre va poder,poniendo a Dios por delante";
        System.out.println("My nice message: " + niceMessage);

        // Step 2

        int daysInWeek = 7;
        System.out.println("There are " + daysInWeek + " days in a week.");

        double coffeePrice = 4.99;
        System.out.println("The price of coffee is $" + coffeePrice);

        char favoriteLetter = 'A';
        System.out.println("My favorite letter is " + favoriteLetter);

        boolean isRaining = false;
        System.out.println("It is " + (isRaining ? "raining." : "not raining."));


    }
}
