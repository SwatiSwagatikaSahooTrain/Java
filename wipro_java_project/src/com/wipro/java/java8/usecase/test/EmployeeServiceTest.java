package com.wipro.java.java8.usecase.test;
import com.wipro.java.java8.usecase.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class EmployeeServiceTest {

    private EmployeeService employeeService;

    @Before
    public void setUp() {
        employeeService = new EmployeeService();
        employeeService.addEmployee(new Employee(1, "Alice", "IT", 50000, LocalDate.of(2020, 5, 10)));
        employeeService.addEmployee(new Employee(2, "Bob", "HR", 45000, LocalDate.of(2019, 3, 15)));
        employeeService.addEmployee(new Employee(3, "Charlie", "Finance", 60000, LocalDate.of(2021, 8, 22)));
    }

    @Test
    public void testAddEmployee() {
        Employee newEmp = new Employee(4, "David", "Marketing", 55000, LocalDate.now());
        employeeService.addEmployee(newEmp);
        Optional<Employee> result = employeeService.searchEmployee(4);
        assertTrue(result.isPresent());
        assertEquals("David", result.get().getName());
    }

    @Test
    public void testRemoveEmployee() {
        employeeService.removeEmployee(2);
        Optional<Employee> result = employeeService.searchEmployee(2);
        assertFalse(result.isPresent());
    }

    @Test
    public void testSearchEmployee() {
        Optional<Employee> result = employeeService.searchEmployee(1);
        assertTrue(result.isPresent());
        assertEquals("Alice", result.get().getName());
    }

    @Test
    public void testUpdateSalary() {
        employeeService.updateSalary(1, 70000);
        Optional<Employee> result = employeeService.searchEmployee(1);
        assertTrue(result.isPresent());
        assertEquals(70000, result.get().getSalary(), 0.01);
    }

    @Test
    public void testDisplayEmployees() {
        assertEquals(3, employeeService.filterByDepartment("IT").size() + employeeService.filterByDepartment("HR").size() + employeeService.filterByDepartment("Finance").size());
    }

    @Test
    public void testFilterByDepartment() {
        List<Employee> hrEmployees = employeeService.filterByDepartment("HR");
        assertEquals(1, hrEmployees.size());
        assertEquals("Bob", hrEmployees.get(0).getName());
    }

    @Test
    public void testSortByName() {
        List<Employee> sortedEmployees = employeeService.sortByName();
        assertEquals("Alice", sortedEmployees.get(0).getName());
        assertEquals("Bob", sortedEmployees.get(1).getName());
        assertEquals("Charlie", sortedEmployees.get(2).getName());
    }

    @Test
    public void testGetAverageSalary() {
        double avgSalary = employeeService.getAverageSalary();
        assertEquals(51666.67, avgSalary, 0.01);
    }
}


