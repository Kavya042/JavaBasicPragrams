package com.programs;

import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		// for both String and int
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value:");
		name = sc.nextLine();
		String res = "";
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			res = ch + res;
		}
		System.out.println("Final value:" + res);
		if (name.equals(res)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
		// For only int
		System.out.println("Enter int value:");
		int number = sc.nextInt();
		int sum = 0, r;
		int temp = number;
		System.out.println("Initial value:" + number);
		while (number > 0) {
			r = number % 10;
			sum = (sum * 10) + r;
			number = number / 10;
		}
		System.out.println("Final value:" + sum);
		if (temp == sum) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
	}
}
