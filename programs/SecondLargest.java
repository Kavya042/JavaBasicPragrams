package com.programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SecondLargest {
	public static void main(String args[]) {
		// Method 1
		int[] a = { 1, 2, 5, 6, 3, 2 };
		System.out.println("length of array is " + a.length);
		int total = a.length;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("array after sorting");
		for (int i = 0; i < total; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Second largest no. in an array is " + a[total - 2]);

		// Method 2
		int[] b = { 1, 2, 5, 6, 7, 3, 2 };
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("Second largest no. in an array is " + b[b.length - 2]);

		// Method 3
		Integer[] c = { 1, 3, 5, 6, 4 };
		List<Integer> list = Arrays.asList(c);
		Collections.sort(list);
		System.out.println("Second largest no. in an array is " + list.get(c.length - 2));

	}
}
