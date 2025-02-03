/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class RollsRoyce extends Car {

	/**
	 * @param args
	 */
	public void carProperties() {
		System.out.println("This car is: " + getBrand() + "Model: " + getModel() + "Price: " + getPrice());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1= new RollsRoyce();
		car1.setBrand("RollsRoyce");
		car1.setModel("RR123");
		car1.setPrice(2000000);
		car1.carProperties();

	}

}
