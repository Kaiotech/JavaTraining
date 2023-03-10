package com.practice;

import java.util.Scanner;

public class OctalPracticeApp {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        long octalNumber, decimalNumber = 0;
        int i = 0;
        System.out.println("Input any octal number: ");
        octalNumber = inputNumber.nextLong();
        while (octalNumber != 0) {
            decimalNumber = (long)(decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        System.out.print("Equivalent decimal number: " + decimalNumber+"\n");
    }
}
