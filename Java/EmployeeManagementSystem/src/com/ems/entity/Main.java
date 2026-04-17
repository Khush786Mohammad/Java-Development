package com.ems.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ems.comparators.EmployeeSalaryOrder;
import com.ems.exceptions.InvalidScoreException;

public class Main {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();

		Comparator<Employee> advComparator = Comparator.comparingDouble(Employee::getSalary)
				.thenComparing(Comparator.comparing(Employee::getPerformanceGrade));
		try {
			addNewEmployee(employees, new Developer(1, "Aman", 80900, 'A', "AI/ML Developer"));
			addNewEmployee(employees, new Developer(2, "Sara", 50000, 'B', "Java Developer"));
			addNewEmployee(employees, new Developer(3, "John", 24000, 'C', "QA"));
			addNewEmployee(employees, new Developer(3, "DOE", 24000, 'A', "QA"));

			// managers
			addNewEmployee(employees, new Manager(4, "Navin", 120000, 'A'));
			addNewEmployee(employees, new Manager(5, "Kartik", 170000, 'D'));
			addNewEmployee(employees, new Manager(5, "Rohit", 190000, 'B'));
			addNewEmployee(employees, new Manager(5, "Rohit", 190000, 'Z'));
		} catch (InvalidScoreException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		employees.forEach(emp -> System.out.println(emp.toString()));

		Collections.sort(employees, new EmployeeSalaryOrder());

		System.out.println("After Employees on their salary");

		employees.forEach(emp -> System.out.println(emp.toString()));

		Collections.sort(employees, advComparator);

		System.out.println("After Employees on their salary and grade");

		employees.forEach(emp -> System.out.println(emp.toString()));
		System.out.println("Employee and their increment");
		employees.forEach(emp -> System.out.println(emp.getName() + ": " + emp.calculateBonus()));

		List<Double> incrementStream = employees.stream()
				.filter(emp -> emp.getPerformanceGrade() == 'B' || emp.getPerformanceGrade() == 'A')
				.map(emp -> emp.calculateBonus()).toList();
		System.out.println("Top performance increments are: ");
		incrementStream.forEach(inc -> System.out.println(inc));
	}

	public static void addNewEmployee(List<Employee> emp, Employee obj) throws InvalidScoreException {
		if (obj.getPerformanceGrade() == 'A' || obj.getPerformanceGrade() == 'B' || obj.getPerformanceGrade() == 'C'
				|| obj.getPerformanceGrade() == 'D') {
			emp.add(obj);
		} else {
			throw new InvalidScoreException("Invalid Grade is found");
		}
	}
}
