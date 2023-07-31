package com.programs;

import java.util.Stack;

public class StringReversal {

	public static void main(String[] args) {
		
		// Method 1
		String name = "Welcome to github";
		System.out.println("before reversing->" + name);
		String result = "";
		char ch;
		for (int i = 0; i < name.length(); i++) {
			ch = name.charAt(i);
			result = ch + result;
		}
		System.out.println("after reversing->" + result);
		
		// Method 2
		String name2 = "Kavya K Kamath";
		System.out.println("before reversing->" + name2);
		StringBuilder sb = new StringBuilder();
		sb.append(name2);
		System.out.println("after reversing->" + sb.reverse());
		
		//Method 3
		String name3 = "Kavya K Kamath";
		System.out.println("before reversing->" + name3);
		System.out.print("after reversing->");
		char[] arr = name3.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		//Method 4
		String name4 = "kavya";
		System.out.println("before reversal->" + name4);
		Stack<Character> stack = new Stack<>();
		for (char c : name4.toCharArray()) {
			stack.push(c);
		}
		String temp = "";
		while (!stack.isEmpty()) {
			temp += stack.pop();
		}
		System.out.println("after revresal->" + temp);
	}
}
