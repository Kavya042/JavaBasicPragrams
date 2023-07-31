package com.programs;

class Swap {
	public static void main(String args[]) {
		// Swapping two numbers using third variable
		int a = 10, b = 20, temp;
		System.out.println("before swapping " + a + " " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping " + a + " " + b);

		// Swapping two variables w/o using third variable
		int c = 10, d = 20;
		System.out.println("before swapping " + c + " " + d);
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("after swapping " + c + " " + d);
	}
}
