package com.wipro.java.collection;
import java.util.*;

public class MapCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
		//put
		map.put(1, "Apple");
		map.put(2, "Banana");
		map.put(3, "Cherry");
		map.put(4, "Dragon Fruit");
		//get
		System.out.println("Key 1: " + map.get(1));
		System.out.println("Key 2: " + map.get(2));
		//remove
		if(map.containsKey(3)) {
			map.remove(3);
		}
		//iterate
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
