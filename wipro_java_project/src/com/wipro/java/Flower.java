/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Flower {
	
	String flowerName;
	String flowerColor;
	
	Flower(String name, String color) {

		this.flowerColor= color;
		this.flowerName= name;
	}
	void display() {
		System.out.println("Flower Name is " + flowerName + " and" + " its color is " + flowerColor);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Flower flwobj1= new Flower("Rose","Red");
		Flower flwobj2= new Flower("Lily","Pink");
		flwobj1.display();
		flwobj2.display();
	}

}
