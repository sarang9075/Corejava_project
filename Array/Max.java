package com.jbk;

public class Max {
	public static void main(String[] args) {
		int[] num = { 5, 10, 15, 20, 50 };
		int Max = num[0];
		for (int i = 1; i < num.length; i++) {
			if (num[i] > Max) {
				Max = num[i];
			}
		}
		System.out.println("Max number is" + Max);
	}

}
