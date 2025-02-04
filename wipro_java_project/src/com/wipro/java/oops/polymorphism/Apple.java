package com.wipro.java.oops.polymorphism;

public class Apple extends Fruits{
	
	public void fruitProperties() {
		System.out.println("This fruit is: " + getName() + " Taste: " + getTaste() + " Seeds: " + isSeeds());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruits fruit= new Apple();
		fruit.setName("Apple");
		fruit.setTaste("Sweet");
		fruit.setSeeds(true);
		fruit.fruitProperties();

	}

}
