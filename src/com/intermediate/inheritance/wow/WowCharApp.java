package com.intermediate.inheritance.wow;

public class WowCharApp {

    public static void main(String[] args) {
        MyWowChar kaiotech = new MyWowChar("Kaiotech", "Vengeance Demon Hunter", "Winter's Envoy", (short) 60, (short) 220, 67140,3357, 1276, (short) 17, (short) 13, (short) 30);
        MyWowChar meldis = new MyWowChar("Meldis", "Discipline Priest", "the Love Fool", (short) 60, (short) 217, 37900, 1895, 1566, (short) 23, (short) 19, (short) 8);
        kaiotech.getStats();
        kaiotech.praise();
        kaiotech.getKaiotechRio();
        System.out.println("Kaiotech is currently at " + kaiotech.getIlvl());
        kaiotech.setIlvl((short) 222);
        System.out.println("Kaiotech will be at " + kaiotech.getIlvl() + " after getting an upgrade");
        System.out.println("---------------------------------------------------------------------------------------------------");
        meldis.getStats();
        meldis.praise();
        meldis.getMeldisRio();
        System.out.println("Meldis is currently at " + meldis.getIlvl());
        meldis.setIlvl((short) 219);
        System.out.println("Meldis will be at " + meldis.getIlvl() + " after getting an upgrade");

    }
}
