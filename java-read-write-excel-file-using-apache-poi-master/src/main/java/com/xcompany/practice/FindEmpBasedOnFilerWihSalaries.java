package com.xcompany.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindEmpBasedOnFilerWihSalaries {

	public static void main(String[] args) {
		  List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("John", 30, 6000.0));
	        employees.add(new Employee("Alice", 25, 4500.0));
	        employees.add(new Employee("Bob", 40, 7000.0));
	        employees.add(new Employee("Eva", 28, 5500.0));
	        employees.add(new Employee("Mike", 35, 4800.0));

	        // Use Java streams to filter employees with salaries greater than 5000
	        List<Employee> highPaidEmployees = employees.stream()
	                .filter(employee -> employee.getSalary() > 5000)
	                .collect(Collectors.toList());

	        // Print the filtered employees
	        System.out.println("Employees with salaries greater than 5000:");
	        for (Employee employee : highPaidEmployees) {
	            System.out.println("Name: " + employee.getName() + ", Salary: " + employee.getSalary());
	        }

	}
}
