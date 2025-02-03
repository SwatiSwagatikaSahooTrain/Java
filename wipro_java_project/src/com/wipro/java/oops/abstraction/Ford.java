/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Ford extends Car {

	@Override
	void brand() {
		System.out.println("Brand Name: Ford");
		
	}

	@Override
	void color() {
		System.out.println("Color Name: Red");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myFord= new Ford();
		myFord.brand();
		myFord.color();

	}
}
