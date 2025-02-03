/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**Parent class - Employee
 * Child class - Developer
 * keyword- extends
 */
public class Developer extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		
		Employee employee= new Developer();
		employee.setEmpId(1120);
		employee.setEmpName("Swati Swagatika Sahoo");
		employee.setEmpDept("Tech");
		employee.setEmpSalary(210000);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpDept());
		System.out.println(employee.getEmpSalary());
	}


}
