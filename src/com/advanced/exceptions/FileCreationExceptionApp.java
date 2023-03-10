package com.advanced.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreationExceptionApp {
    public static void main(String[] args) {
        createFile("outputFile.txt");
    }

    private static void createFile(String filename) {
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(new FileWriter(filename));
        } catch (IOException exception) {
            System.err.println("Caught an IOException: " + exception.getMessage());
        } finally {
            if (outputFile != null) {
                outputFile.close();
                System.out.println("The printWrite is closed.");
            } else {
                System.out.println("The printWrite is not open.");
            }
        }
        System.out.println("This is a line.");
    }
}
