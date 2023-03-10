package com.practice.eandj.v2;

import java.util.ArrayList;
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
                System.out.println(getSoftDrinks());
                break;
            } else {
                System.out.println("Invalid input, try coffee, tea or soft drink.");
            }
        }
    }

//    private static boolean isValidInput(String userInput) {
//        return userInput.equals("coffee") || userInput.equals("tea") || userInput.equals("soft drink");
//    }

    private ArrayList<Product> getCoffees() {
        ArrayList<Product> coffees = new ArrayList<>();

        coffees.add(new Product("Espresso", 790));
        coffees.add(new Product("Americano", 790));
        coffees.add(new Product("Filtered Coffee", 790));
        coffees.add(new Product("Origami Filtered Coffee", 1090));
        coffees.add(new Product("Cortado", 1190));
        coffees.add(new Product("Cappucino", 1190));
        coffees.add(new Product("Cafe Latte", 1190));
        coffees.add(new Product("Flat White", 1190));
        coffees.add(new Product("Cold Brew", 990));
        coffees.add(new Product("Nitro Cold Brew", 1190));
        coffees.add(new Product("Shakerato", 990));
        coffees.add(new Product("Iced Coffee", 1390));
        coffees.add(new Product("Espresso Tonic", 1490));
        coffees.add(new Product("Coffee Lemonade", 1490));

        for (Product coffee : coffees) {
            System.out.println(coffee.name + " " + coffee.price + " Ft");
        }
        return null;
    }
    private ArrayList<Product> getTeas() {
        ArrayList<Product> teas = new ArrayList<>();

        teas.add(new Product("Black tea", 1090));
        teas.add(new Product("Green tea", 1090));
        teas.add(new Product("Fruit tea", 1090));
        teas.add(new Product("Cascara tea", 1190));
        teas.add(new Product("Matcha latte", 1190));
        teas.add(new Product("Turmeric latte", 1190));
        teas.add(new Product("Chai latte", 1190));
        teas.add(new Product("Dirty Chai", 1490));
        teas.add(new Product("Mocha", 1490));

        for (Product tea : teas) {
            System.out.println(tea.name + " " + tea.price + " Ft");
        }

        return null;
    }
    private ArrayList<Product> getSoftDrinks() {
        ArrayList<Product> softDrinks = new ArrayList<>();

        softDrinks.add(new Product("Still water", 790));
        softDrinks.add(new Product("Sparkling water", 790));
        softDrinks.add(new Product("Orange juice", 790));
        softDrinks.add(new Product("Ginger Shot", 1090));
        softDrinks.add(new Product("Zuzmo", 1290));
        softDrinks.add(new Product("Homemade Iced Tea", 1190));
        softDrinks.add(new Product("Homemade Lemonade", 1290));
        softDrinks.add(new Product("Tonic", 1190));
        softDrinks.add(new Product("Elderberry", 1190));
        softDrinks.add(new Product("Raspberry", 1190));
        softDrinks.add(new Product("Apple Spritzer", 1290));
        softDrinks.add(new Product("Indian Tonic Water", 990));
        softDrinks.add(new Product("Artisan Coke", 990));
        softDrinks.add(new Product("Artisan Ginger Ale", 990));

        for (Product softDrink : softDrinks) {
            System.out.println(softDrink.name + " " + softDrink.price + " Ft");
        }

        return null;
    }


}
class Product {

    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
