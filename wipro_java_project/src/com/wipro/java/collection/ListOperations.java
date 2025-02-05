package com.wipro.java.collection;

import java.util.*;

public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating an object of List interface
		//implemented by the ArrayList class
		List<Integer> l1= new ArrayList<Integer>();
		
		//add operation ----> .add()
		l1.add(0, 1); //index, value
		l1.add(1, 2);
		l1.add(2, 4);
		l1.add(3, 14);
		
		System.out.println(l1);
		
		//remove operation -----> .remove()
		l1.remove(2);
		System.out.println(l1);
		
		//set operation ------->.set()
		l1.set(0, 9);
		System.out.println(l1);

	}

}
