package com.wipro.java.collection;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

class HashMapCode {
    public static void main(String[] args) {
        // Creating a HashMap and adding elements
        HashMap<String, Integer> languages1 = new HashMap<>();
        languages1.put("Java", 8);
        languages1.put("JavaScript", 1);
        languages1.put("Python", 3);
        System.out.println("HashMap: " + languages1);

        // Creating another HashMap and adding elements
        HashMap<String, Integer> numbers = new HashMap<>();
        System.out.println("Initial HashMap: " + numbers);
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("HashMap after put(): " + numbers);

        // Creating a HashMap with Integer keys
        HashMap<Integer, String> languages2 = new HashMap<>();
        languages2.put(1, "Java");
        languages2.put(2, "Python");
        languages2.put(3, "JavaScript");
        System.out.println("HashMap: " + languages2);

        // Using get() method
        String value = languages2.get(1);
        System.out.println("Value at index 1: " + value);

        // Displaying keys, values, and key-value pairs
        System.out.println("Keys: " + languages2.keySet());
        System.out.println("Values: " + languages2.values());
        System.out.println("Key/Value mappings: " + languages2.entrySet());

        // Using replace() method
        System.out.println("Original HashMap: " + languages2);
        languages2.replace(2, "C++");
        System.out.println("HashMap using replace(): " + languages2);

        // Removing an element
        String removedValue = languages2.remove(2);
        System.out.println("Removed value: " + removedValue);
        System.out.println("Updated HashMap: " + languages2);

        // Iterating over HashMap
        System.out.print("Keys: ");
        for (Integer key : languages2.keySet()) {
            System.out.print(key + ", ");
        }
        System.out.print("\nValues: ");
        for (String val : languages2.values()) {
            System.out.print(val + ", ");
        }
        System.out.print("\nEntries: ");
        for (Entry<Integer, String> entry : languages2.entrySet()) {
            System.out.print(entry + ", ");
        }
        System.out.println();

        // Creating a TreeMap and converting it to a HashMap
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        System.out.println("TreeMap: " + evenNumbers);

        HashMap<String, Integer> numbersFromTreeMap = new HashMap<>(evenNumbers);
        numbersFromTreeMap.put("Three", 3);
        System.out.println("HashMap from TreeMap: " + numbersFromTreeMap);
    }
}

