package com.intermediate.inheritance.car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger( "red", (byte)3, (short)450, (short)717, (short)7700, (int)40000, (int)15000, (boolean) false);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();


        System.out.println("----------------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)400, (short)550, (short)3500, (int)27500, (int)22000, (boolean) false);
        blackToyotaSupra.getDescription();
        blackToyotaSupra.startTheEngine();
    }
}
