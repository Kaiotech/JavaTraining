package com.practice.league;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

public class LeagueDataApp {


    public static void main(String[] args) {

        System.out.println("Enter a champions name: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        ArrayList<Champions> champions = new ArrayList<>();

        champions.add(new ADCarry("Akshan", "The Rogue Sentinel", "Marksman", 2021));
        champions.add(new ADCarry("Ashe", "The Frost Archer", "Marksman", 2009));
        champions.add(new ADCarry("Aphelios", "The Weapon of the Faithful", "Marksman", 2019));
        champions.add(new ADCarry("Caitlyn", "The Sheriff of Piltover", "Marksman", 2011));
        champions.add(new ADCarry("Corki", "The Daring Bombardier", "Marksman", 2009));
        champions.add(new ADCarry("Draven", "The Glorious Executioner", "Marksman", 2012));
        champions.add(new ADCarry("Ezreal", "The Prodigal Explorer", "Marksman", 2010));
        champions.add(new ADCarry("Jhin", "The Virtuoso", "Marksman", 2016));
        champions.add(new ADCarry("Jinx", "The Loose Cannon", "Marksman", 2013));
        champions.add(new ADCarry("Kai'Sa", "Daughter of the Void", "Marksman", 2018));
        champions.add(new ADCarry("Kalista", "The Spear of Vengeance", "Marksman", 2014));
        champions.add(new ADCarry("Kog'Maw", "The Mouth of the Abyss", "Marksman", 2010));
        champions.add(new ADCarry("Lucian", "The Purifier", "Marksman", 2013));
        champions.add(new ADCarry("Miss Fortune", "The Bounty Hunter", "Marksman", 2010));
        champions.add(new ADCarry("Quinn", "Demacia's Wings", "Marksman", 2013));
        champions.add(new ADCarry("Samira", "The Desert Rose", "Marksman", 2020));
        champions.add(new ADCarry("Senna", "The Redeemer", "Marksman", 2019));
        champions.add(new ADCarry("Sivir", "The Battle Mistress", "Marksman", 2009));
        champions.add(new ADCarry("Tristana", "The Yordle Gunner", "Marksman", 2009));
        champions.add(new ADCarry("Twitch", "The Plague Rat", "Marksman", 2009));
        champions.add(new ADCarry("Varus", "The Arrow of Retribution", "Marksman", 2012));
        champions.add(new ADCarry("Vayne", "The Night Hunter", "Marksman", 2011));
        champions.add(new ADCarry("Xayah", "The Rebel", "Marksman", 2017));
        champions.add(new ADCarry("Zeri", "The Spark of Zaun", "Marksman", 2022));

        champions.add(new Supports("Alistar", "The Minotaur", "Support", 2009));
        champions.add(new Supports("Bard", "The Wandering Caretaker", "Support", 2015));
        champions.add(new Supports("Braum", "The Heart of the Freljord", "Support", 2014));
        champions.add(new Supports("Blitzcrank", "The Great Steam Golem", "Support", 2009));
        champions.add(new Supports("Galio", "The Colossus", "Support", 2010));
        champions.add(new Supports("Janna", "The Storm's Fury", "Support", 2009));
        champions.add(new Supports("Karma", "The Enlightened One", "Support", 2011));
        champions.add(new Supports("Leona", "The Radiant Dawn", "Support", 2011));
        champions.add(new Supports("Lulu", "The Fae Sorceress", "Support", 2012));
        champions.add(new Supports("Morgana", "The Fallen", "Support", 2009));
        champions.add(new Supports("Nami", "The Tidecaller", "Support", 2012));
        champions.add(new Supports("Nautilus", "The Titan of the Depths", "Support", 2012));
        champions.add(new Supports("Pyke", "The Bloodharbor Ripper", "Support", 2018));
        champions.add(new Supports("Rakan", "The Charmer", "Support", 2017));
        champions.add(new Supports("Renata Glasc", "The Chem-Baroness", "Support", 2022));
        champions.add(new Supports("Sona", "Maven of the Springs", "Support", 2010));
        champions.add(new Supports("Soraka", "The Starchild", "Support", 2009));
        champions.add(new Supports("Tahm Kench", "The River King", "Support", 2015));
        champions.add(new Supports("Taric", "The Shield of Valoran", "Support", 2009));
        champions.add(new Supports("Thresh", "The Chain Warden", "Support", 2013));
        champions.add(new Supports("Yuumi", "The Magical Cat", "Support", 2019));


        for (Champions champion : champions) {
            if (champion.getName().equalsIgnoreCase(userInput)) {
                champion.getBio();
            }
        }


    }

}