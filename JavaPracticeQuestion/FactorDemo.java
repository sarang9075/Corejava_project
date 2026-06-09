package com.tka;

public class FactorDemo {
	public static int factor(int no) {
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		return fact;

	}

	public static void main(String[] args) {
		int result = factor(5);
		System.out.println("Factorial" + result);
	}
}
