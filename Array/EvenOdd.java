package com.jbk;

public class EvenOdd {
	public static void main(String[] args) {
		int num[] = { 3, 5, 7, 9, 8, 6, 4, 2, };
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("even number");
			} else {
				System.out.println("odd number");
			}
		}
	}
}
