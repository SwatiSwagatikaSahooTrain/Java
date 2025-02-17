package com.wipro.java.collection;

import java.util.*;

public class TreeMapToHashMap {
    public static void main(String[] args) {
        // Step 1: Create and populate a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Orange");
        treeMap.put(4, "Mango");

        // Step 2: Fetch data from TreeMap and store it in a HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }

        // Display initial collections
        System.out.println("Initial TreeMap: " + treeMap);
        System.out.println("Initial HashMap: " + hashMap);

        // Operation 1: Adding new elements to TreeMap and HashMap
        treeMap.put(5, "Pineapple");
        hashMap.put(6, "Grapes");

        // Operation 2: Removing an element from TreeMap and HashMap
        treeMap.remove(2);  // Removes entry with key 2 (Banana)
        hashMap.remove(4);  // Removes entry with key 4 (Mango)

        // Operation 3: Check if a key exists in both collections
        System.out.println("Does TreeMap contain key 3? " + treeMap.containsKey(3)); // true
        System.out.println("Does HashMap contain key 4? " + hashMap.containsKey(4)); // false

        // Operation 4: Getting the size of both collections
        System.out.println("Size of TreeMap: " + treeMap.size());
        System.out.println("Size of HashMap: " + hashMap.size());

        // Operation 5: Iterating through keys or values
        System.out.println("Keys in TreeMap:");
        for (Integer key : treeMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("Values in HashMap:");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }

        // Operation 6: Clearing both collections
        treeMap.clear();
        hashMap.clear();

        // Display the cleared collections
        System.out.println("Cleared TreeMap: " + treeMap);
        System.out.println("Cleared HashMap: " + hashMap);
    }
}

