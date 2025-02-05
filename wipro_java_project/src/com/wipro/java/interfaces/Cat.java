package com.wipro.java.interfaces;

public class Cat implements Animal {

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat= new Cat();
		cat.makeSound();
	}

}
