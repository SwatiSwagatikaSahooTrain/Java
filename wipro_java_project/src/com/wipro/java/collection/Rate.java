package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Rate implements Comparator<Movie1> {
	
	public int compare(Movie1 m1, Movie1 m2) {
		return Double.compare(m1.getR(),m2.getR());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens", 8.3, 2015));
		m1.add(new Movie1("Star Wars", 8.7, 1977));
		m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));
		
		Collections.sort(m1, new Rate());
		System.out.println("\nMovies sorted by Rate:");
		for(Movie1 m: m1) {
			System.out.println(m.getN() + " " + m.getR() + " " + m.getY());
		}
	}

}