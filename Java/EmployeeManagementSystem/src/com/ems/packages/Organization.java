package com.ems.packages;

@FunctionalInterface
public interface Organization {
	
	public double incrementSalary(double salary, double increment);
	public static void organizationName() {
		System.out.println("Employees are working in XYZ");
	}
	
	default void orgData() {
		System.out.println("To confidential data");
	}
}
