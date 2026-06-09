package com.tka;

public class ReverseNO {
	public static int getReverseNumber(int num) {
		int reverse = 0;
		while (num > 0) {
			// get last digit
			int rem = num % 10;
			// builds reverse no
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		// return reverse number
		return reverse;
	}

	public static void main(String[] args) {
		int result = getReverseNumber(125);
		System.out.println("Reverse Number " + result);
	}
}
