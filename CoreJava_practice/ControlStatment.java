package com.tka;

public class ControlStatment {
	// returnexample
	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		// if statment
		int age = 20;
		if (age >= 18) {
			System.out.println("True");
		}

		// if else statment
		int number = 15;
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

		// nested if
		boolean haslicense = true;
		if (age >= 18) {
			if (haslicense) {
				System.out.println("You can drive");
			} else {
				System.out.println("License required");
			}

		}

		// else if ladder
		int mark = 78;
		if (mark >= 90) {
			System.out.println("GRADE A");
		} else if (mark >= 80) {
			System.out.println("GRADE B");
		} else if (mark >= 70) {
			System.out.println("GRADE C");
		} else if (mark >= 60) {
			System.out.println("GRADE D");
		} else {
			System.out.println("FAIL");
		}

		// SWITCH CASE
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("invalid day");
		}

		// break statment
		System.out.println("BREAK STATMENT EXAMPLE");
		for (int i = 1; i >= 10; i++) {
			if (i == 6) {
				break;
			}

			System.out.println(i + "");
		}
		// continue Statement
		System.out.println("\nContinue Example");
		for (int i = 1; i <= 10; i++) {
			if (i == 6) {
				continue;
			}
			System.out.print(i + " ");
		}

		//  return Statement
		int result = add(10, 20);
		System.out.println("\nSum = " + result);

	}
}
