package com.advanced.innerclasses;

import com.advanced.enumcoding.pizza.PizzaSize;

public class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    class PizzaSlice {
        public String calculatePizzaSliceArea() {
            switch (pizzaSize) {
                case SMALL:
                default:
                    return "Small size";
                case MEDIUM:
                    return "Medium size";
                case LARGE:
                    return "Large size";
            }
        }
    }

    public PizzaSlice cutPizzaSlice() {
        return new PizzaSlice();
    }

    private double calculatePrice() {
        switch (pizzaSize) {
            case SMALL:
            default:
                return 5.99;
            case MEDIUM:
                return 7.99;
            case LARGE:
                return 10.99;
        }
    }

    public String getName() {
        return name;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public double getPrice() {
        return price;
    }
}

