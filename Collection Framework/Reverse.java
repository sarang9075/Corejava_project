package com.tka;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		name.add("Sarang");
		name.add("Rahul");
		name.add("Sohan");
		name.add("Chandu");
		name.add("Shivam");
		System.out.println("Orignal" + name);
		Collections.reverse(name);
		System.out.println("Reverse " + name);
	}
}
