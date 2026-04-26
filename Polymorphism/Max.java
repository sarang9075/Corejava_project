package com.Polymorphism;

public class Max {
	void Max(int a, int b) {
		if (a > b) {
			System.out.println("The Max number is " + a);
		} else {
			System.out.println("The Max number is " + b);

		}
	}

	void Max(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("The Max number is" + a);
		} else if (b > a && b > c) {
			System.out.println(" The Max number is " + b);
		} else {
			System.out.println("The Max number is " + c);
		}
	}
}