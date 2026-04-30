package com.jbk;

public class Duplicate {
	public static void main(String[] args) {
		int[] num = { 10, 20, 10, 20, 40, 50 };
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < i; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}
		}
	}
}
