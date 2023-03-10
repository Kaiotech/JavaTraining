package com.advanced.arrayfunctions;


import java.util.Arrays;

public class ArrayFunctionsApp {
    public static void main(String[] args) {
        int[] gamerPoints = new int[12];
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("All players start with 200 points.");
        Arrays.fill(gamerPoints, 200);
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The first 10 players lost 20 points.");
        Arrays.fill(gamerPoints, 0, 10, 180);
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The 10th player gained 50 points");
        gamerPoints[9] += 50;
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The gamer Points in order");
        Arrays.sort(gamerPoints);
        System.out.println(Arrays.toString(gamerPoints));

        System.out.println("The last 5 points");
        int[] theLastFivePoints = Arrays.copyOf(gamerPoints, 5);
        System.out.println(Arrays.toString(theLastFivePoints));

        System.out.println("The top 5 points");
        int[] topFivePoints = Arrays.copyOfRange(gamerPoints, gamerPoints.length - 5, gamerPoints.length);
        System.out.println(Arrays.toString(topFivePoints));

        if (Arrays.equals(theLastFivePoints, topFivePoints)) {
            System.out.println("The top 5 players have the same points as the last 5 players");
        } else {
            System.out.println("The top 5 players don't have the same points as the last 5 players");

        }
        gamerPoints[4] = 300;
        Arrays.sort(gamerPoints);

        if (Arrays.binarySearch(gamerPoints, 300) >= 0) {
            System.out.println("Someone reached 300 points");
        } else {
            System.out.println("Theres noboby that reached 300 points yet");
        }
    }
}
