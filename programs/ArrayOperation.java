package com.programs;

import java.util.Arrays;
import java.util.Collections;

class ArrayOperation {
	public static void main(String args[]) {
		// Matching elements in an integer array
		int[] array1 = { 1, 2, 3, 4, 5, 1, 2, 6, 7 };
		for (int i = 0; i < array1.length; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}

		// Sum of all the elements in an array
		int[] x = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		System.out.println("Result " + sum);
		
		// Reversing an array - 1
		Integer[] b = { 10, 20, 30, 40, 50 };
		Collections.reverse(Arrays.asList(b));
		System.out.println(Arrays.asList(b));
		
		// Reversing an array - 2
		Integer[] a = { 10, 20, 30, 40, 50, 60 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		System.out.println(Arrays.asList(a));

	}
}
