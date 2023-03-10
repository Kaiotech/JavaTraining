package com.advanced.enumcoding;

public class Coffee {

    private String name;
    private CoffeeSize coffeeSize;
    private double price;

    public Coffee(String name, CoffeeSize coffeeSize) {
        this.name = name;
        this.coffeeSize = coffeeSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch (coffeeSize) {
            case SMALL:
            default:
                return 2.50;
            case MEDIUM:
                return 3.70;
            case LARGE:
                return 4.65;
        }
    }

    public String getName() {
        return name;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public double getPrice() {
        return price;
    }
}
