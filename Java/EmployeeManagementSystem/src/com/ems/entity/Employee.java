package com.ems.entity;

import com.ems.packages.Organization;

public abstract class Employee implements Organization {
	protected int id;
	protected String name;
	protected double salary;
	protected Character performanceGrade;

	abstract double calculateBonus();

	public Employee() {
		System.out.println("Employee Default Constructor Intialized");
	}

	public Employee(int id, String name, double salary, Character performanceGrade) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.performanceGrade = performanceGrade;
	};

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Character getPerformanceGrade() {
		return performanceGrade;
	}

	public void setPerformanceGrade(Character performanceGrade) {
		this.performanceGrade = performanceGrade;
	}

	// toString method
	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + ", performanceGrade="
				+ performanceGrade + '}';
	}
}
