package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Animal implements Comparable<Animal> {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Animal a) {
        return this.age - a.age; // Sorting by age in ascending order
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Elephant", 25));
        animalList.add(new Animal("Lion", 10));
        animalList.add(new Animal("Giraffe", 15));

        Collections.sort(animalList);

        System.out.println("Animals after sorting by age:");
        for (Animal a : animalList) {
            System.out.println(a.getName() + " - Age: " + a.getAge());
        }
    }
}
