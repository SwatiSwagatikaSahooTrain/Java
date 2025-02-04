package com.wipro.java.exception;

public class UncheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20, num2=0, divide;
		try {
			divide=num1/num2;
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: "+ e.getMessage());
		}

	}

}
