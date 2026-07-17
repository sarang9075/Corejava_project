package com.tka;
import java.util.Scanner;
 class ScannerDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// taking input
	int a = sc.nextInt();
	sc.nextLine();
	String Name = sc.nextLine();
	float Mark = sc.nextFloat();
	
	sc.close();
	
}
}
