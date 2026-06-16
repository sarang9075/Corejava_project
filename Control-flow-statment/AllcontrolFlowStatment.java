package com.controlflow;

public class AllcontrolFlowStatment {
	public static void main(String[] args) {
		int num = 17;
		int Month = 3;
		if (num % 2 == 0) {
			// if else statment
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
		// Switch case
		switch (Month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("Invalid month");
			break;
		}
		// For loop
		System.out.println("\nTable of " + num);
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
		// While loop
		System.out.println("\nCounting using while loop ");
		int i = 1;
		while (i <= num) {
			System.out.println(i);
			i++;
		}
		// Do while loop
		System.out.println("Reverse counting Using Do While Loop");
		int j = num;
		do {
			System.out.println(j);
			j--;
		} while (j >= 1);
		// continue
		System.out.println("Continue Example");
		for (int k = 1; k <= 10; k++) {
			if (k == 5) {
				continue;
			}
			System.out.println(k);
		}
		System.out.println("Break Example");
		for (int k = 1; k <= 10; k++) {
			if (k == 8) {
				break;
			}
			System.out.println(k);
		}
	}
}
