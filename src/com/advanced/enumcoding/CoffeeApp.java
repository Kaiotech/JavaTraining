package com.advanced.enumcoding;

public class CoffeeApp {

    public static void main(String[] args) {
        System.out.println("Available sizes: ");
        for (CoffeeSize coffeeSize : CoffeeSize.values()) {
            System.out.println("-" + coffeeSize.getCoffeeSizeText());
        }

        System.out.println();

        Coffee coffeeOrder = new Coffee("Latte", CoffeeSize.MEDIUM);

        System.out.println("I ordered the following coffee: ");
        System.out.println("Name: " + coffeeOrder.getName());
        System.out.println("Size: " + coffeeOrder.getCoffeeSize().getCoffeeSizeText());
        System.out.println("price: $" + coffeeOrder.getPrice());
    }
}
