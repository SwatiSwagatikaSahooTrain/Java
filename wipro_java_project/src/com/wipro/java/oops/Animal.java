package com.wipro.java.oops;

/**NO CONSTRUCTOR
 * Getters have return value
 * Setters have no return value
 * properties are determined using private field
 * values are behaviors are determined through setters
 * toString()   
 */
public class Animal {
	
	private String name;
	private String species;
	private String type;
	
	public Animal() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "Animal name: " + name + "species: " + species + "type: " + type;
	}
	

}
