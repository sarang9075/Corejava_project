package com.tka;

public class Alphabet_Triangle {
	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
