package com.advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterApp {
    public static void main(String[] args) {
        String JULIUS_CESAR_PATH = "src/com/advanced/filehandling/JuliusCesar.txt";

        try (FileWriter bookWriter = new FileWriter(JULIUS_CESAR_PATH)) {
            bookWriter.write("Even you, Brutus?");
            bookWriter.append("\nYes.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
