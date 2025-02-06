package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnimalAge implements Comparator<Animal1> {

    public int compare(Animal1 a1, Animal1 a2) {
        return Integer.compare(a1.getAge(), a2.getAge());
    }

    public static void main(String[] args) {
        ArrayList<Animal1> animalList = new ArrayList<>();
        animalList.add(new Animal1("Elephant", 25));
        animalList.add(new Animal1("Lion", 10));
        animalList.add(new Animal1("Giraffe", 15));

        Collections.sort(animalList, new AnimalAge());
        System.out.println("\nAnimals sorted by Age:");
        for (Animal1 a : animalList) {
            System.out.println(a.getName() + " - Age: " + a.getAge());
        }
    }
}
