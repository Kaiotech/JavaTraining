package com.advanced.enumcoding;

public enum CoffeeSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private String coffeeSizeText;

    CoffeeSize(String coffeeSizeText){
        this.coffeeSizeText = coffeeSizeText;
    }

    public String getCoffeeSizeText() {
        return coffeeSizeText;
    }
}
