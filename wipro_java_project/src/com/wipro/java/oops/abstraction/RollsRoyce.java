/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class RollsRoyce extends Car {
	
	@Override
	void brand() {
		System.out.println("Brand Name: RollsRoyce");
	}
	
	@Override
	void color() {
		System.out.println("Color Name: Black");
	}
	
	public static void main(String[] args) {
		Car myRollsRoyce = new RollsRoyce();
		myRollsRoyce.brand();
		myRollsRoyce.color();
	}
}
