package com.wipro.java.oops.inheritance;

/**Parent class - Employee
 * Child class - Manager
 * keyword- extends
 */
public class Manager extends Employee{

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Child object is instantiated from child constructor
		// Parent class consumes properties and behavior
		
		Employee employee= new Manager();
		employee.setEmpId(1001);
		employee.setEmpName("Swati Swagatika");
		employee.setEmpDept("IT");
		employee.setEmpSalary(210000);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpDept());
		System.out.println(employee.getEmpSalary());

	}

}
