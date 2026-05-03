package com.tka;
import java.util.Vector;
public class VectorEach {
public static void main(String[] args) {
	Vector<Integer> num = new Vector <>();
	num.add(40);
	num.add(50);
	num.add(60);
	num.add(70);
	num.add(80);
	num.add(90);
	for (Integer i : num) {
		System.out.println(num);
	}
}
}
