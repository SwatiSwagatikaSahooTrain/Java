package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {

    public StreamApi() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // Creating a list of strings
        List<String> list = Arrays.asList("Pratik", "Rahul", "Manikanta");
        List<String> stream = list.stream()
                                  .filter(name -> name.startsWith("P"))
                                  .collect(Collectors.toList());
        System.out.println(stream);
        
        List<String> stream1 = list.stream()
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());
        System.out.println(stream1);
        //MinMax
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        
        // Finding the maximum number
        Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
        System.out.println("Maximum Number: " + maxNumber.orElse(null));
        
        // Finding the minimum number
        Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
        System.out.println("Minimum Number: " + minNumber.orElse(null));
        
        //Sorting
        List<Integer> numbers1 = Arrays.asList(5, 2, 8, 1, 3);
        List<Integer> sortedNumbers = numbers1.stream()
           .sorted()
           .collect(Collectors.toList());
        System.out.println(sortedNumbers);
    }
}