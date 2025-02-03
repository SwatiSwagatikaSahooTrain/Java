/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Car {

	private String brand;
    private String model;
    private double price;
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public void carProperties() {
		System.out.println("This car is: " + brand + "Model: " + model + "Price: " + price);
	}

}
