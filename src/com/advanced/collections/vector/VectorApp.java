package com.advanced.collections.vector;

import java.util.Vector;

public class VectorApp {

    public static void main(String[] args) {
        Vector<String> toDoVector = new Vector<>(2, 3);
        System.out.println("Initial capacity of the vector: " + toDoVector.capacity());

        toDoVector.add("Cleaning the garden.");
        toDoVector.add("Painting the walls.");
        toDoVector.add("Feeding the cat.");

        System.out.println("Capacity of the vector: " + toDoVector.capacity());
        System.out.println("Size of the vector: " + toDoVector.size());

        System.out.println("The first element of the vector is: " + toDoVector.firstElement());
        System.out.println("The last element of the vector is: " + toDoVector.lastElement());
    }
}
