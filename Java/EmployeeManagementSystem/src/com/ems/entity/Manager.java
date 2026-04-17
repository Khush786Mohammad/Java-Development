package com.ems.entity;

class Manager extends Employee {
	Manager() {
		super();
		System.out.println("Default Constructor of Manager is initialized");
	}

	Manager(int id, String name, double salary, Character performanceGrade) {
		super(id, name, salary, performanceGrade);
	}

	@Override
	double calculateBonus() {
		if (performanceGrade == 'A') {
			return super.getSalary() * 0.18;
		} else if (performanceGrade == 'B') {
			return super.getSalary() * 0.12;
		} else {
			return super.getSalary() * 0.08;
		}
	}

	@Override
	public double incrementSalary(double salary, double increment) {
		return salary + increment;
	}
}
