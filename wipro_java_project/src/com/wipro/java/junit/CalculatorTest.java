package com.wipro.java.junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
	
	private final Calculator calculator = new Calculator();
	
	@Test
	public void testAdd() {
		int result = calculator.add(5,2);
		assertEquals(7, result);
	}
	
	@Test
	public void testSubtract() {
		int result = calculator.subtract(9, 3);
		assertEquals(6, result);
	}
	
	@Test
	public void testAddWithNegativeNumbers() {
		int result = calculator.add(-3, -2);
		assertEquals(-5, result);
	}
	
	@Test
	public void testSubtractWithNegativeNumbers() {
		int result = calculator.subtract(-9, -3);
		assertEquals(-6, result);
	}
}
