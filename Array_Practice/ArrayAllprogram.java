package com.jbk;

import java.util.Arrays;

public class ArrayAllprogram {
	public static void main(String[] args) {
		// original array
		int[] arr = { 10, 20, 30, 40, 50 };

		// 1.print array
		System.out.println("1.print array");
		for (int num : arr) {
			System.out.println(num + " ");
		}

		// 2. sum array
		System.out.println("2.sum array");
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		System.out.println("\n\n2. Sum = " + sum);

		// 3. Average
		double avg = (double) sum / arr.length;
		System.out.println("3. Average = " + avg);

		// 4. Maximum
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		System.out.println("4. Maximum = " + max);

		// 5. Minimum
		int min = arr[0];
		for (int num : arr) {
			if (num < min) {
				min = num;
			}
		}
		System.out.println("5. Minimum = " + min);

		// 6. Search Element
		int search = 30;
		boolean found = false;
		for (int num : arr) {
			if (num == search) {
				found = true;
				break;
			}
		}
		System.out.println("6. Search 30 = " + found);

		// 7. Reverse Array
		System.out.print("7. Reverse Array: ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

		// 8. Copy Array
		int[] copy = Arrays.copyOf(arr, arr.length);
		System.out.println("\n\n8. Copied Array = " + Arrays.toString(copy));

		// 9. Sort Array
		int[] arr2 = { 40, 10, 30, 50, 20 };
		Arrays.sort(arr2);
		System.out.println("9. Sorted Array = " + Arrays.toString(arr2));

		// 10. Second Largest
		int[] arr3 = { 10, 40, 20, 80, 60 };
		Arrays.sort(arr3);
		System.out.println("10. Second Largest = " + arr3[arr3.length - 2]);

		// 11. Even Numbers
		System.out.print("11. Even Numbers: ");
		for (int num : arr) {
			if (num % 2 == 0)
				System.out.print(num + " ");
		}

		// 12. Odd Numbers
		System.out.print("\n12. Odd Numbers: ");
		for (int num : arr) {
			if (num % 2 != 0)
				System.out.print(num + " ");
		}

		// 13. Count Even & Odd
		int even = 0, odd = 0;
		for (int num : arr) {
			if (num % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("\n13. Even Count = " + even);
		System.out.println("    Odd Count = " + odd);

		// 14. Frequency of Element
		int[] arr4 = { 10, 20, 10, 30, 20, 10 };
		int key = 10;
		int count = 0;
		for (int num : arr4) {
			if (num == key)
				count++;
		}
		System.out.println("14. Frequency of 10 = " + count);

		// 15. Duplicate Elements
		System.out.print("15. Duplicate Elements: ");
		for (int i = 0; i < arr4.length; i++) {
			for (int j = i + 1; j < arr4.length; j++) {
				if (arr4[i] == arr4[j]) {
					System.out.print(arr4[i] + " ");
					break;
				}
			}
		}

		// 16. Merge Two Arrays
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] merge = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++)
			merge[i] = a[i];

		for (int i = 0; i < b.length; i++)
			merge[a.length + i] = b[i];

		System.out.println("\n16. Merged Array = " + Arrays.toString(merge));

		// 17. Two-Dimensional Array
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };

		System.out.println("17. 2D Array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
