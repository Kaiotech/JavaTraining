package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterCreationApp {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Welcome to the World of Warlords!");
        System.out.println("Here you can create your character: ");

        System.out.println("Name: ");
        String name = userInput.nextLine();

        System.out.println("Please choose a faction: ");
        System.out.println("Moehran or Elyssian");
        while (!userInput.hasNext("moehran") && !userInput.hasNext("elyssian")) {
            System.err.println("Invalid faction.");
            userInput.nextLine();
        }
        String faction = userInput.nextLine();


        System.out.println("Race: ");
        List<String> races = new ArrayList<>();
        races.add("human");
        races.add("orc");
        races.add("elf");
        races.add("undead");
        races.add("troll");
        races.add("dwarf");
        System.out.println(races);
        while (!userInput.hasNext("human") && !userInput.hasNext("orc") && !userInput.hasNext("elf") && !userInput.hasNext("undead")
                && !userInput.hasNext("troll") && !userInput.hasNext("dwarf")) {
            System.err.println("Invalid race");
            userInput.nextLine();
        }


        String race = userInput.nextLine();

        System.out.println("Select a class: ");
        List<String> classes = new ArrayList<>();
        classes.add("warrior");
        classes.add("paladin");
        classes.add("ranger");
        classes.add("mage");
        classes.add("warlock");
        classes.add("assassin");
        classes.add("mystic");
        classes.add("shaman");
        System.out.println(classes);
        while (!userInput.hasNext("warrior") && !userInput.hasNext("paladin") && !userInput.hasNext("ranger") && !userInput.hasNext("mage")
                    && !userInput.hasNext("warlock") && !userInput.hasNext("assassin") && !userInput.hasNext("mystic") && !userInput.hasNext("shaman")) {
            System.err.println("Invalid class");
            userInput.nextLine();
        }
        String selectedClass = userInput.nextLine();

        System.out.println("Nightmare mode: ");
        String nightmareMode = userInput.nextLine();
        if (nightmareMode.equalsIgnoreCase("yes")) {
            System.out.println("Nightmare mode is ON.");

        } else if (nightmareMode.equalsIgnoreCase("no")) {
            System.out.println("Nightmare mode is OFF.");
        } else {
            System.err.println("Invalid input. Please say yes or no.");
            userInput.nextLine();

        }

        System.out.println("------------------------------------");
        System.out.println("Your character has been created:");
        System.out.println();
        System.out.println("Name: " + name.toUpperCase());
        System.out.println("Faction: " + faction.toUpperCase());
        System.out.println("Race: " + race.toUpperCase());
        System.out.println("Class: " + selectedClass.toUpperCase());
        System.out.println("Nightmare mode: " + nightmareMode.toUpperCase());
    }
}
