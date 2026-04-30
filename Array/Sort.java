package com.jbk;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] num = { 20, 45, 46, 77, 89, 90 };
		Arrays.sort(num);
		System.out.println("Sorted Arrays");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}
}
