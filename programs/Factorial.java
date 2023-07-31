package com.programs;

//Without Recursion
/*public class Factorial {
	public static void main(String args[]) {
		int n = 5, fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of a given number is " + fact);
	}
}*/

//With Recursion
class Factorial {
	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return n * factorial(n - 1);
	}

	public static void main(String args[]) {
		int fact = factorial(5);
		System.out.println("factorial of a given number is " + fact);
	}
}