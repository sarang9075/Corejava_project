package com.controlflow;

public class Loan {
	public static void main(String[] args) {
		int age = 24;
		double salary = 30000;
		if (age >= 18) {
			System.out.println("This person is Eligible for getting Loan");
			if (salary > 45000) {
				System.out.println("Loan Approved");
			} else {
				System.out.println("Loan not Approved");
			}
		} else {
			System.out.println("your not Eligible");

		}
	}
}
