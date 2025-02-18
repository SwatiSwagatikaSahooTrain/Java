package com.wipro.java.collection;

import java.util.Scanner;
import java.util.TreeMap;

// Abstraction: Abstract class defining the structure for Fibonacci calculation
abstract class FibonacciBase {
    protected TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();

    // Abstract method to be implemented in subclass
    public abstract int calculateFibonacci(int n);
}

// Inheritance: FibonacciCalculator extends FibonacciBase
class FibonacciCalculator extends FibonacciBase {
    @Override
    public int calculateFibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        // Check if Fibonacci(n) is already computed
        if (fibonacciMap.containsKey(n)) {
            return fibonacciMap.get(n);
        }

        // Compute and store the result in the map
        int result = calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        fibonacciMap.put(n, result);
        return result;
    }

    // Method to retrieve the stored Fibonacci numbers
    public TreeMap<Integer, Integer> getFibonacciMap() {
        return fibonacciMap;
    }
}

// POJO class: Plain Old Java Object to store Fibonacci results
class FibonacciResult {
    private final int term;
    private final int value;

    public FibonacciResult(int term, int value) {
        this.term = term;
        this.value = value;
    }

    public int getTerm() {
        return term;
    }

    public int getValue() {
        return value;
    }
}

// Main class to run the program
public class FibonacciInTreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        scanner.close();

        // Create an instance of FibonacciCalculator
        FibonacciCalculator calculator = new FibonacciCalculator();

        // Compute Fibonacci numbers
        TreeMap<Integer, Integer> fibonacciMap = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            int value = calculator.calculateFibonacci(i);
            fibonacciMap.put(i, value);
        }

        // Display results using the POJO class
        System.out.println("Fibonacci Series stored in TreeMap:");
        for (var entry : fibonacciMap.entrySet()) {
            FibonacciResult result = new FibonacciResult(entry.getKey(), entry.getValue());
            System.out.println("Term " + result.getTerm() + " : " + result.getValue());
        }
    }
}
