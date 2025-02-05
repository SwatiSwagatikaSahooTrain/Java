package com.wipro.java.interfaces;

public class Dinosaur implements Animal, Extinct {

	public void doesExist() {
		// TODO Auto-generated method stub
		System.out.println("Doesn't exist");
	}

	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Roar");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinosaur dino= new Dinosaur();
		dino.doesExist();
		dino.makeSound();
	}

}
