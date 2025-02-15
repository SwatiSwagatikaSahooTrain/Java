package com.wipro.java.collection;

import java.util.*;
import java.util.TreeMap;

public class TreeMapCode {
    
    // Method to demonstrate TreeMap creation
    static void createTreeMap() {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        System.out.println("TreeMap created: " + treeMap);
    }
    
    // Method to demonstrate adding elements
    static void addElements(TreeMap<String, Integer> treeMap) {
        treeMap.put("A", 1);
        treeMap.put("C", 3);
        treeMap.put("B", 2);
        System.out.println("TreeMap after adding elements: " + treeMap);
    }
    
    // Method to demonstrate retrieving elements
    static void getElement(TreeMap<String, Integer> treeMap, String key) {
        System.out.println("Value for key " + key + ": " + treeMap.get(key));
    }
    
    // Method to demonstrate removing elements
    static void removeElement(TreeMap<String, Integer> treeMap, String key) {
        treeMap.remove(key);
        System.out.println("TreeMap after removing key " + key + ": " + treeMap);
    }
    
    // Method to demonstrate iterating over TreeMap
    static void iterateTreeMap(TreeMap<String, Integer> treeMap) {
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
    
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        createTreeMap();
        addElements(treeMap);
        getElement(treeMap, "A");
        removeElement(treeMap, "B");
        iterateTreeMap(treeMap);
    }
}

