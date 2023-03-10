package com.practice;

import java.util.Scanner;

public class FlopOrBop {

    public static void main(String[] args) {

        System.out.println("Enter Viktor or Vera: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();


        while (true) {

            if (userInput.equalsIgnoreCase("Viktor")) {
                System.out.println("flop!");
                break;
            }
            if (userInput.equalsIgnoreCase("Vera")){
                System.out.println("bop");
            } else {
                System.out.println("invalid input.");
                break;
            }
        }

    }
}
