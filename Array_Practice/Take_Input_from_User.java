package com.jbk;

import java.util.Scanner;

public class Take_Input_from_User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number");
			arr[i] = sc.nextInt();
		}

		System.out.println("Array Element");
		for (int num : arr) {
			System.out.println(num);
		}
	}
}
