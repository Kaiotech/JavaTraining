package com.advanced.io;

import java.util.Scanner;

public class CharacterApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the World of Warlords!");
        System.out.println("Here you can create your character: ");

        System.out.print("Name: ");
        String name = userInput.nextLine();

        System.out.println("Race (human or orc): ");
        while (!userInput.hasNext("human") && !userInput.hasNext("orc")) {
            System.err.println("Invalid race");
            userInput.nextLine();
        }

        String race = userInput.nextLine();


        System.out.println("Difficulty (0 - easy, 1 - medium, 2 - hard like my dick: ");
        while (!userInput.hasNextByte(3)) {
            System.err.println("Invalid difficulty, try again");
            userInput.nextLine();
        }

        byte difficulty = userInput.nextByte();


        System.out.println("Nightmare mode (true or false): ");
        while (!userInput.hasNextBoolean()) {
            System.err.println("Invalid input, try true or false");
            userInput.nextLine();
        }

        boolean nightmareMode = userInput.nextBoolean();

        System.out.println("-----------------------------");
        System.out.println("Your character is created: ");
        System.out.printf("Name: \t\t%s\n", name);
        System.out.printf("Race: \t\t%s\n", race);
        System.out.printf("Difficulty: \t%d\n", difficulty);
        System.out.printf("Is Nightmare mode on: \t%b\n", nightmareMode);
    }
}
