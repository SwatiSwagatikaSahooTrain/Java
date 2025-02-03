/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * 
 */
/**
 * 
 */
public class Employee {

	private int empId; //for employee Id
    private String empName; //for employee Name
    private String empDept; //for employee Department
    private double empSalary; //for employee Salary

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Employee ";
	}

}
