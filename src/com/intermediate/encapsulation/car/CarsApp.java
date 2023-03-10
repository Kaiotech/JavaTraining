package com.intermediate.encapsulation.car;

public class CarsApp {
    public static void main(String[] args) {
        DodgeChallenger redDodgeChallenger = new DodgeChallenger( "red", (byte)3, (short)450, (short)717, (short)7700, (int)40000, (int)15000, (boolean) false);
        System.out.println(redDodgeChallenger.getCarName() + "'s price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.setPrice(35000);
        System.out.println(redDodgeChallenger.getCarName() + "'s new price is $" + redDodgeChallenger.getPrice());
        redDodgeChallenger.startTheEngine();
        System.out.println("The car has " + redDodgeChallenger.getMileage() + " miles");
        redDodgeChallenger.drive(100);
        System.out.println("After driving the car, it has " + redDodgeChallenger.getMileage() + " miles");


        System.out.println("----------------------------------------------------");
        ToyotaSupra blackToyotaSupra = new ToyotaSupra("black", (byte)1, (short)400, (short)550, (short)3500, (int)27500, (int)22000, (boolean) false);
        System.out.println(blackToyotaSupra.getCarName() + "'s price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.setPrice(32000);
        System.out.println(blackToyotaSupra.getCarName() + "'s new price is $" + blackToyotaSupra.getPrice());
        blackToyotaSupra.startTheEngine();
        System.out.println("The car has " + blackToyotaSupra.getMileage() + " miles");
        blackToyotaSupra.drive(200);
        System.out.println("After driving the car, it has " + blackToyotaSupra.getMileage() + " miles");
    }
}
