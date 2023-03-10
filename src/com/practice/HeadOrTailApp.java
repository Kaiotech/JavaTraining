package com.practice;

import java.util.Random;
import java.util.Scanner;

public class HeadOrTailApp {

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Welcome to Head or Tail!");

        while (true) {
            System.out.println("To make a move type in head or tail. To exit the game type in quit.");
            System.out.print("Your move: ");
            String userMove = inputScanner.nextLine().toLowerCase();

            if (userMove.equals("quit")){
                break;
            }
            if (isValidInput(userMove)) {
                String opponentMove = generateMove();
                isUserWon(userMove, opponentMove);
            } else {
                System.out.println("Yor input was invalid.");
            }



        }

    }

    public static boolean isValidInput(String userInput) {
        return userInput.equals("head") || userInput.equals("tail");
    }

    public static String generateMove(){
        Random random = new Random();
        switch (random.nextInt(2)){
            case 0:
            default:
                return "head";
            case 1:
                return "tail";
        }
    }

    public static void isUserWon(String userMove, String opponentMove) {
        if (userMove.equals(opponentMove)) {
            System.out.println("You win!");
        } else if (userMove.equals("head") && opponentMove.equals("tail") || userMove.equals("tail") && opponentMove.equals("head")) {
            System.out.println("You lost!");
        }
    }


}
