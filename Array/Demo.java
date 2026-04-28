package com.jbk;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// index start with 0
		// 0 1 2 3 4 5 index =5
//	 int[] array = { 2,5,7,4,6,8 }; // length 6
//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);
//		System.out.println(array[5]);
//	
//	System.out.println(array.length-1);
//		for (int i=0 ; i < array.length; i++){
//			System.out.println(array[i]);
//		}
//		String[] Name = {"sarang","sonu","chandu","suraj","rahul"};
//		for (int i =0; i<Name.length; i++){
//			System.out.println(Name[i]);
//		}
//		char [] symbol = {'@','$','&','%','*'};
//		for (int i =0;i<symbol.length;i++) {
//			System.out.println(symbol[i]);
//		}
//		int[] num = new int[4];
//		num[0] = 24;
//		num[1] = 20;
//		num[2] = 5;
//		num[3] = 10;
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//		
//		Scanner sc = new Scanner(System.in);
//		
//				System.out.println("Enter 5 names ... !");
//			String[] name = new String[4];
//		
//				for (int i = 0; i < name.length; i++) {
//					name[i] = sc.nextLine();
//				}
//		
//				System.out.println("----------------------");
//				for (int i = 0; i < name.length; i++) {
//				System.out.println(name[i]);
//				}
//
//				int[] arr = { 3, 4, 6, 5, 9 };
//		
//				for (int i = 0; i < arr.length; i++) {
//				if (arr[i] % 2 == 1) {
//						System.out.println(arr[i]);
//					}
//				}

		int[] arr = { 36, 20, 60, 5, 9 };
		Arrays.sort(arr);
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
