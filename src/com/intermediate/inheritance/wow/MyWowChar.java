package com.intermediate.inheritance.wow;

public class MyWowChar extends ChampionsOfAzeroth implements RaiderIO{


    public MyWowChar(String name, String spec, String title, short level, short ilvl, int health, int stamina, int mainStat, short criticalStrike, short haste, short versatility){
        super(name, spec, title, level, ilvl, health, stamina, mainStat, criticalStrike, haste, versatility);
    }
    @Override
    public void praise() {
        System.out.println("No! This is Patrick!");
    }



    @Override
    public void getKaiotechRio() {
        System.out.println(name + "'s highest RIO score was 2133.");

    }

    @Override
    public void getMeldisRio() {
        System.out.println(name + "'s highest RIO score was 1889.");
    }
}
