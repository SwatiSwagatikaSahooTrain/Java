package com.wipro.java.collection;

class Node1 {
    String key;
    int value;
    Node1 next;

    public Node1(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

class MyHashMap {
    private static final int SIZE = 10; // Default size of HashMap
    private Node1[] buckets;

    public MyHashMap() {
        buckets = new Node1[SIZE];
    }

    // Hash function to compute index
    private int getIndex(String key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    // Insert key-value pair
    public void put(String key, int value) {
        int index = getIndex(key);
        Node1 newNode = new Node1(key, value);
        
        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node1 temp = buckets[index];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    temp.value = value; // Update value if key exists
                    return;
                }
                if (temp.next == null) {
                    temp.next = newNode;
                    return;
                }
                temp = temp.next;
            }
        }
    }

    // Get value by key
    public Integer get(String key) {
        int index = getIndex(key);
        Node1 temp = buckets[index];
        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null; // Key not found
    }

    // Remove key from HashMap
    public void remove(String key) {
        int index = getIndex(key);
        Node1 temp = buckets[index], prev = null;

        while (temp != null) {
            if (temp.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = temp.next;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Display HashMap contents
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            Node1 temp = buckets[i];
            while (temp != null) {
                System.out.print("[" + temp.key + " -> " + temp.value + "] -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
}

public class UserHashMap {
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();
        
        // Inserting values
        map.put("Alice", 100);
        map.put("Bob", 200);
        map.put("Charlie", 300);
        map.put("Alice", 150); // Updating Alice's value
        map.put("David", 400);

        // Display HashMap
        System.out.println("HashMap Contents:");
        map.display();

        // Retrieving values
        System.out.println("\nValue for Alice: " + map.get("Alice"));
        System.out.println("Value for Charlie: " + map.get("Charlie"));

        // Removing a key
        map.remove("Bob");
        System.out.println("\nHashMap after removing 'Bob':");
        map.display();
    }
}

