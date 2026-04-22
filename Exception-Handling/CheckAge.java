package com.tka;

public class CheckAge {
	void age (int age) {
		if (age <20) {
			throw new IllegalArgumentException(" Not Eligible");
		}
		System.out.println("Eligible");
	}

}
