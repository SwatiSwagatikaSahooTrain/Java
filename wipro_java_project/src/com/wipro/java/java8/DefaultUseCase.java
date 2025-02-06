package com.wipro.java.java8;


interface TestInterface4{
	default void show() {
		System.out.println("I dont carry any results of sum");
	}
}
interface TestInterface3{
	default void show() {
		System.out.println("The sum of 4 + 5 is: " + (4+5));
	}
}
public class DefaultUseCase implements TestInterface3 ,TestInterface4 {
	

	@Override
	public void show() {
		//using super keyword to call the show method of TestInterface3
				TestInterface3.super.show();
				//using super keyword to call the show method of TestInterface4
				TestInterface4.super.show();
		
	}
public static void main(String[] args) {
	DefaultUseCase d  = new DefaultUseCase();
	d.show();
	}

}
