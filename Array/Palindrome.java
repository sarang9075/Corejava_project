package com.jbk;

public class Palindrome {
	public static void main(String[] args) {
		int[] num = { 10, 20, 30, 40, 40 };
		int i = 0;
		int j = num.length - 1;
		while (i < j) {
			if (num[i] != num[j]) {
				System.out.println("its not palindrome");
			}
			i++;
			j++;
		}
		System.out.println("its palindrome");
	}
}
