package com.wipro.java.exception;

public class JavaClassException {
	
	static int num1 =2; //it is accessible by all the instances of the class
	//memory or storage is allocated once and remains useless it is empty
	// it has class level declaration

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=50, num2=0, data;
		try {
			data= num1/num2;
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Executed");
		}
		System.out.println("Rest of the code");
	}

}
