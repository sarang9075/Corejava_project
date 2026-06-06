package com.tka;

public class CheckCharacter {
	public static void checkCharacter(char Ch) {
		if (Character.isAlphabetic(Ch)) { // built in method check alphabet
			System.out.println(Ch + " = Is an Alphabet");
		} else if (Character.isDigit(Ch)) { // built in method check digit
			System.out.println(Ch + " =Is an Digit");
		} else {
			System.out.println(Ch + " = Is an Special Symbol");
		}
	}

	public static void main(String[] args) {
		checkCharacter('A');
		checkCharacter('7');
		checkCharacter('$');
	}
}
