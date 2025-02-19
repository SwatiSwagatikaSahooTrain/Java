package com.wipro.java.collection;

import java.util.*;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNumber;
    }
}

public class StudentDuplicateHashMap {
    public static void main(String[] args) {
        // HashMap with List to allow duplicates
        HashMap<String, List<Student>> studentMap = new HashMap<>();

        // Sample students with duplicate names and roll numbers
        Student[] students = {
            new Student("Alice", 101),
            new Student("Bob", 102),
            new Student("Alice", 101),
            new Student("Charlie", 103),
            new Student("Bob", 102),
            new Student("David", 104),
            new Student("Emma", 105),
            new Student("Alice", 106),
            new Student("Charlie", 103),
            new Student("Emma", 105)
        };

        // Storing students in HashMap
        for (Student s : students) {
            studentMap.computeIfAbsent(s.name, k -> new ArrayList<>()).add(s);
        }

        // Displaying students
        for (Map.Entry<String, List<Student>> entry : studentMap.entrySet()) {
            System.out.println("Students with name " + entry.getKey() + ": " + entry.getValue());
        }
    }
}

