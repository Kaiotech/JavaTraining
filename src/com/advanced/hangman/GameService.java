package com.advanced.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class GameService {

    private static final String WORD_PATH = "src/com/advanced/hangman/words.txt";

    public void start() throws FileNotFoundException {
        Scanner inputScanner = new Scanner(System.in);
        String randomWord = getRandomWord();
        char[] randomWordArray = randomWord.toCharArray();
        char[] guessingArray = new char[randomWord.length()];
        Arrays.fill(guessingArray, '_');
        int numberOfChances = randomWord.length() + 10;

        System.out.println("Start the game!");
        System.out.println("The length of the word: " + randomWord.length() + " And number of chances: " + numberOfChances);
        System.out.println("The word: " + new String(guessingArray));

        while (true) {
            System.out.println("-------------------");
            System.out.print("Please type in a letter: ");
            String inputLine = inputScanner.nextLine();
            char letter = inputLine.charAt(0);

            boolean isGuessingCorrect = false;
            for (int i = 0; i < randomWord.length(); i++) {
                if (letter == randomWordArray[i]) {
                    guessingArray[i] = letter;
                    isGuessingCorrect = true;
                }
            }
            if (isGuessingCorrect) {
                System.out.println("It was a good guess!");
                System.out.println("Word: " + new String(guessingArray));
                if (isGameIsFinished(guessingArray)) {
                    break;
                }
            } else {
                numberOfChances--;
                if (numberOfChances == 0) {
                    System.out.println("Sorry, the game is finished, you lost.");
                    System.out.println("The word was: " + randomWord);
                    break;
                }
                System.out.println("Wrong!");
                System.out.println("Your chances reduced to: " + numberOfChances);
                System.out.println("Try another letter");
            }

        }
        System.out.println("The word: " + new String(guessingArray));



    }

    private boolean isGameIsFinished(char[] guessingArray) {
        for (int i = 0; i < guessingArray.length; i++) {
            if (guessingArray[i] == '_') {
                return false;
            }
        }
        System.out.println("Congratulation you won!");
        System.out.println("The word: " + new String(guessingArray));
        return true;
    }

    private String getRandomWord() throws FileNotFoundException {
        List<String> words = getTheWords();

        Random randomNumberGenerator = new Random();
        int randomNumber = randomNumberGenerator.nextInt(words.size());

        return words.get(randomNumber);
    }

    private List<String> getTheWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();

        File wordsFile = new File(WORD_PATH);
        Scanner wordScanner = new Scanner(wordsFile);
        while (wordScanner.hasNextLine()) {
            words.add(wordScanner.nextLine());
        }
        return words;
    }
}
