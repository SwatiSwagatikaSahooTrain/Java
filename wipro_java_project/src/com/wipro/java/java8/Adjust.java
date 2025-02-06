package com.wipro.java.java8;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Adjust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingAdjusters();
	}
	public static void checkingAdjusters() {
		LocalDate date= LocalDate.now();
		System.out.println("The current date is" +date);
		
		LocalDate dayofNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("First day of next month: " + dayofNextMonth);
		
		LocalDate nextSaturday = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("Next saturday from now is " + nextSaturday);
		
		LocalDate firstDay = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("First Day of the month is " + firstDay);
		
		LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("Last day of the month is " + lastDay);
		
	
	
	}

}
