package com.practice;

import java.util.Scanner;

public class TemperatureConvertApp {

    public static void main(String[] args) {
        System.out.println("Enter the temperature in Centigrade: ");
        Scanner inputTemperature = new Scanner(System.in);
        int celsius = Integer.parseInt(inputTemperature.nextLine());
        float fahrenheit = ((9 * celsius)/5) + 32;

        System.out.println("The temperature in Fahrenheit: " + fahrenheit);
    }
}
