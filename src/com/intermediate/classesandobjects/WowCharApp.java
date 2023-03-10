package com.intermediate.classesandobjects;

public class WowCharApp {
    public static void main(String[] args) {
        MyWowChar kaiotech = new MyWowChar("Kaiotech", "Vengeance Demon Hunter", "Winter's Envoy", (short) 60, (short) 220, 67140,3357, 1276, (short) 17, (short) 13, (short) 30);
        MyWowChar meldis = new MyWowChar("Meldis", "Discipline Priest", "the Love Fool", (short) 60, (short) 217, 37900, 1895, 1566, (short) 23, (short) 19, (short) 8);
        kaiotech.getStats();
        System.out.println("---------------------------------------------------------------------------------------------------");
        meldis.getStats();

    }
}
