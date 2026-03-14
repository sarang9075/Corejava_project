package com.controlflow;

public class ElectricityBiil {
	public static void main(String[] args) {
		int units = 205;
		if (units >=0 && units <=100) {
			System.out.println("The units cost is 5 rupee par units, Total Bill :" +(units * 5));
		} else if (units >=0 && units <= 200) {
			System.out.println("The units cost is 7 rupee par units, Total Bill :"+(units * 7));
		} else if  (units >200){
			System.out.println("The units cost is 10 rupee par units, Total Bill:"+(units * 10));
			
		}
	}

}
