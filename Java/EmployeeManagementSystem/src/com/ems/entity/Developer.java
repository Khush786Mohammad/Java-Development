package com.ems.entity;

class Developer extends Employee {
	protected String role;

	public Developer() {
		super();
		System.out.println("Developer Default Constructor Initiaized");
	}

	public Developer(int id, String name, double salary, Character performanceGrade, String role) {
		super(id, name, salary, performanceGrade);
		this.role = role;
	}

	@Override
	double calculateBonus() {
		if (performanceGrade == 'A') {
			return super.getSalary() * 0.12;
		} else if (performanceGrade == 'B') {
			return super.getSalary() * 0.08;
		} else {
			return super.getSalary() * 0.04;
		}
	}

	public String getRole() {
		return this.role;
	}

	@Override
	public double incrementSalary(double salary, double increment) {
		return salary + increment;
	}
}
