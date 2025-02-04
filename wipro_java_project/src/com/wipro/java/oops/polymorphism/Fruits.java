/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Fruits {
	
	private String name;
	private String taste;
	private boolean seeds;
	public Fruits() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public boolean isSeeds() {
		return seeds;
	}
	public void setSeeds(boolean seeds) {
		this.seeds = seeds;
	}
	
	public void fruitProperties() {
		System.out.println("This fruit is: " + name + " Taste: " + taste + " Seeds: " + seeds);
	}
}
