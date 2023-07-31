package com.programs;

import java.util.*;

class ListOfPrimeNumbers {
	static public boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int start = sc.nextInt();
		System.out.println("Enter second number");
		int end = sc.nextInt();
		System.out.println("List of prime numbers");
		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}
}
