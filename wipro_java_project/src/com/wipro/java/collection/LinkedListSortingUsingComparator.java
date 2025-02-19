package com.wipro.java.collection;

import java.util.Comparator;
import java.util.LinkedList;

//POJO class for LinkedList elements
class Person {
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 // Override toString() for easy printing
 @Override
 public String toString() {
     return name + " (" + age + " years)";
 }
}

//Comparator to sort by age
class AgeComparator implements Comparator<Person> {
 @Override
 public int compare(Person p1, Person p2) {
     return Integer.compare(p1.getAge(), p2.getAge());
 }
}

//Main class
public class LinkedListSortingUsingComparator {
 public static void main(String[] args) {
     // Create a LinkedList of Person objects
     LinkedList<Person> people = new LinkedList<>();
     people.add(new Person("Alice", 25));
     people.add(new Person("Bob", 30));
     people.add(new Person("Charlie", 22));
     people.add(new Person("David", 28));

     // Display before sorting
     System.out.println("Before Sorting:");
     for (Person p : people) {
         System.out.println(p);
     }

     // Sort using Comparator
     people.sort(new AgeComparator());

     // Display after sorting
     System.out.println("\nAfter Sorting by Age:");
     for (Person p : people) {
         System.out.println(p);
     }
 }
}

