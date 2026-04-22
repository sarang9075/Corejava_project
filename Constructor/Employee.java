package com.constructor;

public class Employee {
	double salary = 50000;

	public Employee(String name, int empID, double salary) {
		System.out.println("Employee Information ---------->");
		System.out.println("Employee Name :" + name);
		System.out.println("Employee ID :" + empID);
		System.out.println("Employee salary :" + salary);
		System.out.println("Actual salary " + bonous());
	}

	public double bonous() {
		double bonous = 5000;
		return salary + bonous;

	}
}
