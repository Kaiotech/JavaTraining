package com.practice.league;

public abstract class Champions {

    private String name;
    private String title;
    private String role;
    private int releaseYear;

    public Champions(String name, String title, String role, int releaseYear) {
        this.name = name;
        this.title = title;
        this.role = role;
        this.releaseYear = releaseYear;
    }

    public String getName() {
        return name;
    }

    public void getBio() {
        System.out.println("Name: " + name);
        System.out.println("Title: " + title);
        System.out.println("Role: " + role);
        System.out.println("Release Year: " + releaseYear);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Champions{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", role='" + role + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }


}
