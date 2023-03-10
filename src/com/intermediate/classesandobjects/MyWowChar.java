package com.intermediate.classesandobjects;

public class MyWowChar {
        String name;
        String spec;
        String title;
        short level;
        short ilvl;
        int health;
        int stamina;
        int mainStat;
        short criticalStrike;
        short haste;
        short versatility;

    public MyWowChar(String name, String spec, String title, short level, short ilvl, int health, int stamina, int mainStat, short criticalStrike, short haste, short versatility){
        this.name = name;
        this.spec = spec;
        this.title = title;
        this.level = level;
        this.ilvl = ilvl;
        this.health = health;
        this.stamina = stamina;
        this.mainStat = mainStat;
        this.criticalStrike = criticalStrike;
        this.haste = haste;
        this.versatility = versatility;
    }
    public void getStats(){
        System.out.println("Character name: " + name);
        System.out.println("Character spec: " + spec);
        System.out.println("Character title: " + title);
        System.out.println("Level: " + level);
        System.out.println("Item level: " + ilvl);
        System.out.println("Health: " + health);
        System.out.println("Stamina: " + stamina);
        System.out.println("Main Stat: " + mainStat);
        System.out.println("Critical Strike: " + criticalStrike + "%");
        System.out.println("Haste: " + haste + "%");
        System.out.println("Versatility: " + versatility + "%");
    }
}
