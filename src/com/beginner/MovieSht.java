package com.beginner;

public class MovieSht {

    public static void main(String[] args) {
        String actorName = "Ryan Reynolds";
        int yearOfBorn = 1976;
        int age = 2022 - yearOfBorn;

        String[] movieTitles = {
                "Deadpool", "Deadpool 2", "Free Guy", "The Hitman's Bodyguard", "Red Notice", "The Adam Project",
        };
        float[] movieRatings = {
                8.0F, 7.7F, 7.1F, 6.9F, 6.3F, 6.7F
        };
        System.out.println("Name: " + actorName);
        System.out.println("Year of Birth: " + yearOfBorn);
        System.out.println("Age: " + age);

        System.out.println("Movies: ");

        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " - " + getRating(movieRatings[i]));
            
        }
    }
    static String getRating(float rating){
        if (rating <= 5.0){
            return "bad";
        } else if (rating > 5.0 && rating <= 6.5){
            return "average";
        } else if (rating > 6.5 && rating <= 7.0){
            return "good";
        } else if (rating > 7.0 && rating <= 8.0){
            return "very good";
        }else {
            return "amazing";
        }
    }
}
