package com.jbk;

public class MainCar {
	public static void main(String[] args) {
		Car bmw = new Car();
		System.out.println("Bmw modelyr :" + (bmw.modelyr = 2020));
		System.out.println("Bmw price :" + (bmw.price = 20000000));
		System.out.println("Bmw color :" + (bmw.color = "black"));
	}

}
