package com.scanner;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
}
