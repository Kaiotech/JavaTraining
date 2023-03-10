package com.intermediate.classesandobjects;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger("red", (byte)3, (short)450, (short)717, (short)7700, (int)40000, (int)15000, (boolean) false);
        redDodgeChallenger.getDescription();
        redDodgeChallenger.startTheEngine();


        System.out.println("----------------------------------------------------");
        DodgeChallenger orangeDodgeChallenger = new DodgeChallenger("orange", (byte)1, (short)392, (short)492, (short)6700, (int)30000, (int)10000, (boolean) false);
        orangeDodgeChallenger.getDescription();
        orangeDodgeChallenger.startTheEngine();

    }
}
