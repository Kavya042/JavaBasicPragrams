package com.programs;

public class PrimeNumber {
	public static void main(String args[]) {
		int flag = 0, n = 3;
		if (n == 0 || n == 1) {
			flag = 1;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				// for(int i=2;i<Math.sqrt(n);i++)//
				if (n % i == 0) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}
}
