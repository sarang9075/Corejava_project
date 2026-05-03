package com.tka;

import java.util.ArrayList;

public class ElementExist {
	public static void main(String[] args) {
		ArrayList color = new ArrayList();
		color.add("red");
		color.add("green");
		color.add("blue");
		color.add("orange");
		color.add("yellow");
		String search = "yellow";
		if (color.contains("yellow")) {
			System.out.println("yes it Exist");
		} else {
			System.out.println("Does not Exist");
		}

	}
}
