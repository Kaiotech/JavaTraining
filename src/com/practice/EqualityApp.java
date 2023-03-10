package com.practice;

import java.util.Scanner;

public class EqualityApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int numberOne = input.nextInt();
        System.out.println("Input second number: ");
        int numberTwo = input.nextInt();
        System.out.println("Input third number: ");
        int numberThree = input.nextInt();
        System.out.println("Input fourth number: ");
        int numberFour = input.nextInt();

        if (!(numberOne == numberTwo && numberTwo == numberThree && numberThree == numberFour)) {
            System.out.println("The numbers are not equal.");
        } else {
            System.out.println("The numbers are equal.");
        }
    }
}
