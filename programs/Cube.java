package com.programs;

class calculate {
	static int cube(int x) {
		return x * x * x;
	}
}

class Cube {
	public static void main(String[] args) {
		int res = calculate.cube(5);
		System.out.println("cube of a number is " + res);
	}
}
