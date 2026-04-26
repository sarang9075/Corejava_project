package com.scanner;

import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter is first number");
		a = sc.nextInt();
		System.out.println("Enter is second number");
		b = sc.nextInt();
		System.out.println("Enter is third number");
		c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("The Number is larger" + a);
		} else if (b > c) {
			System.out.println("The Number is larger" + b);
		} else {
			System.out.println("The Numberis larger" + c);
		}
	}
}