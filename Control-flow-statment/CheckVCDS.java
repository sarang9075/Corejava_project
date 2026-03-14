package com.controlflow;

public class CheckVCDS {
	public static void main(String[] args) {
		char a = 's';
		if (a >= '0' && a <= '9') {
			System.out.println("it is a Digit");
	} else if ( a =='@' || a == '#' || a=='$' ) {
		System.out.println("this is a special symbol ");
	}else if (a == 'a' || a =='e' || a == 'i'  || a=='o' || a == 'u') {
		System.out.println("charecter is Vowel");
	} else {
		System.out.println("it is consonant");
	}
	}

}
