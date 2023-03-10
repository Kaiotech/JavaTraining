package com.beginner;

import java.util.Random;

public class Arrays {

    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        Random randomNumberGenerator = new Random();

        lotteryNumbers[0] = randomNumberGenerator.nextInt(90) + 1;
        lotteryNumbers[1] = 88;
        lotteryNumbers[2] = 13;
        lotteryNumbers[3] = 74;
        lotteryNumbers[4] = 56;

        for (int lotteryNumber : lotteryNumbers) {
            System.out.println(lotteryNumber);
        }

        int[][] weeklyLotteryNumbers = {
                {22, 34, 65, 69, 31},
                {10, 45, 76, 72, 11},
                {1, 55, 12, 33, 32},
                {2, 27, 96, 99, 3},
                {6, 93, 38, 43, 7}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");


            }
            System.out.println();

        }


    }
}



