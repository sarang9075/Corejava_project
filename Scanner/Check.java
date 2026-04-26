package com.scanner;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter your number");
		a = sc.nextInt();
		if (a > 0) {
			System.out.println("The number is positive");
		} else if (a < 0) {
			System.out.println("The number is Negetive");
		} else {
			System.out.println("The number is 0");
		}
	}
}
