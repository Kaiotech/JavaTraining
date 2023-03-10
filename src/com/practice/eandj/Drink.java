package com.practice.eandj;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Drink {

    public void order() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Welcome to Edison & Jupiter!");
        System.out.println("What kind of drink can I offer you?");
        System.out.println("Type in coffee, tea or soft drink");

        while (true) {

            String userInput = scanner.nextLine();

            if (Objects.equals(userInput, "coffee")) {
                System.out.println("Here are our available coffees: ");
                System.out.println(getCoffees());
                break;
            }

            if (Objects.equals(userInput, "tea")) {
                System.out.println("Here are our available teas: ");
                System.out.println(getTeas());
                break;
            }
            if (Objects.equals(userInput, "soft drink")) {
                System.out.println("Here are our available soft drinks: ");
                System.out.println(getTeas());
                break;
            } else {
                System.out.println("Invalid input, try coffee, tea or soft drink.");
            }
        }
    }

//    private static boolean isValidInput(String userInput) {
//        return userInput.equals("coffee") || userInput.equals("tea") || userInput.equals("soft drink");
//    }

    private HashMap<String, Integer> getCoffees() {
        HashMap<String, Integer> coffees = new HashMap<>();

        coffees.put("Espresso", 790);
        coffees.put("Americano", 790);
        coffees.put("Filtered Coffee", 790);
        coffees.put("Origami Filtered Coffee", 1090);
        coffees.put("Cortado", 1190);
        coffees.put("Cappucino", 1190);
        coffees.put("Cafe Latte", 1190);
        coffees.put("Flat White", 1190);
        coffees.put("Cold Brew", 990);
        coffees.put("Nitro Cold Brew", 1190);
        coffees.put("Shakerato", 990);
        coffees.put("Iced Coffee", 1390);
        coffees.put("Espresso Tonic", 1490);
        coffees.put("Coffee Lemonade", 1490);

        return coffees;
    }
    private HashMap<String, Integer> getTeas() {
        HashMap<String, Integer> teas = new HashMap<>();

        teas.put("Black tea", 1090);
        teas.put("Green tea", 1090);
        teas.put("Fruit tea", 1090);
        teas.put("English Breakfast tea", 1190);
        teas.put("Cascara tea", 1190);
        teas.put("Matcha latte", 1190);
        teas.put("Turmeric latte", 1190);
        teas.put("Chai latte", 1190);
        teas.put("Dirty Chai", 1490);
        teas.put("Mocha", 1490);

        return teas;
    }
    private HashMap<String, Integer> getSoftDrinks() {
        HashMap<String, Integer> softDrinks = new HashMap<>();

        softDrinks.put("Still water", 790);
        softDrinks.put("Sparkling water", 790);
        softDrinks.put("Orange juice", 790);
        softDrinks.put("Ginger Shot", 1090);
        softDrinks.put("Zuzmo", 1290);
        softDrinks.put("Homemade Iced Tea", 1190);
        softDrinks.put("Homemade Lemonade", 1290);
        softDrinks.put("Tonic", 1190);
        softDrinks.put("Elderberry", 1190);
        softDrinks.put("Raspberry", 1190);
        softDrinks.put("Apple Spritzer", 1290);
        softDrinks.put("Indian Tonic Water", 990);
        softDrinks.put("Artisan Coke", 990);
        softDrinks.put("Artisan Ginger Ale", 990);

        return softDrinks;
    }


}
