package com.wipro.java.exception;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Sleeping for 2 seconds...");
            Thread.sleep(2000); // Causes InterruptedException (Checked Exception)
            System.out.println("Get up");
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception:" + e.getMessage());
			//e.printStackTrace();
		}
	}

}
