/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Ford extends Car {

	public void carProperties() {
		System.out.println("This car is: " + getBrand() + "Model: " + getModel() + "Price: " + getPrice());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car2= new Ford();
		car2.setBrand("Ford");
		car2.setModel("F123");
		car2.setPrice(400000);
		car2.carProperties();
	}

}
