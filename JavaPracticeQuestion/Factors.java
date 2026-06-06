package com.tka;

public class Factors {
	public static void PrintFactors(int num) {
		System.out.println("Factors are :");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		PrintFactors(6);
	}
}
