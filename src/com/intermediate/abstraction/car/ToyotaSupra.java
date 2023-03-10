package com.intermediate.abstraction.car;

public class ToyotaSupra extends Car {


    ToyotaSupra(String color, byte numberOfVehicleOwners, short power, short horsePower, int price, int mileage, int i, boolean isDamaged) {
        super("Toyota Supra", color, numberOfVehicleOwners, power, horsePower, price, mileage, isDamaged);
    }

    @Override
    public void startTheEngine() {
        System.out.println("A Toyota Supra engine is started.");
    }
}
