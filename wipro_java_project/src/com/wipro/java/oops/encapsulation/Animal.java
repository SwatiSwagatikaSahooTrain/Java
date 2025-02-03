package com.wipro.java.oops.encapsulation;

public class Animal {
    private String species;
    private int age;

    // Constructor
    public Animal(String species, int age) {
        this.species = species;
        setAge(age); // Using setter for validation
    }

    // Getter and Setter for species
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter and Setter for age with validation
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        Animal a1 = new Animal("Lion", 5);
        System.out.println("Species: " + a1.getSpecies());
        System.out.println("Age: " + a1.getAge());

        a1.setAge(7);
        System.out.println("Updated Age: " + a1.getAge());

        a1.setAge(-3); // This should show an error message
    }
}
