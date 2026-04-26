package com.scanner;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float r;
		System.out.println("Enter Redius");
		r = sc.nextFloat();
		System.out.println("The area of circle is" + (3.4 * r * r));
	}
}
