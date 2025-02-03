/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**Parent class - Employee
 * Child class - ProjectLead
 * keyword- extends
 */
public class ProjectLead extends Employee {


	public ProjectLead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
		//Child object is instantiated from child constructor
		// Parent class consumes properties and behavior
		
		//ProjectLead projectLead= new ProjectLead();
		//ProjectLead projectLead1= (ProjectLead) new Employee();
		Employee employee = new ProjectLead();
		employee.setEmpId(1234);
		employee.setEmpName("Swati");
		employee.setEmpDept("IT");
		employee.setEmpSalary(34000);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpDept());
		System.out.println(employee.getEmpSalary());
	}

}
