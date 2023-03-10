package com.intermediate.stringfunctions;

import java.util.Scanner;

public class StringFunctionApp {
    public static void main(String[] args) {
        Scanner keyboardInPut = new Scanner(System.in);
        String inputText = keyboardInPut.nextLine();

        if (inputText.equals("Paris")) {
            System.out.println("Paris was typed in");
        } else {
            System.out.println("The text typed in is: " + inputText);
        }

        if (inputText.equalsIgnoreCase("Paris")) {
            System.out.println("Paris was typed in");
        } else {
            System.out.println("The text typed in is: " + inputText);
        }
        if (inputText.contains("Par")){
            System.out.println("The text contains Par.");
        }

        if (inputText.isEmpty()){
            System.out.println("The input text is empty.");
        }

        System.out.println("The input text length is: " + inputText.length());
        System.out.println("The input text with uppercase: " + inputText.toUpperCase());
        System.out.println("The input text with lowercase: " + inputText.toLowerCase());


        if (inputText.startsWith("P") || inputText.endsWith("P")){
            System.out.println("The input text starts or ends with P letter.");

        }
        System.out.println("The replaced text is: " + inputText.replace("N", "D"));
    }
}
