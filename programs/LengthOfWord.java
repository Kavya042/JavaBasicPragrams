package com.programs;

import java.util.ArrayList;
import java.util.List;

public class LengthOfWord {
	// Method 1
	public int calculate(final String n) {
		int len = 0;
		String x = n.trim();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == ' ') {
				len = 0;
			} else {
				len++;
			}
		}
		return len;
	}

	// Method 2
	public int calculate_2(final String n) {
		int len = 0;
		boolean flag = false;
		for (int i = n.length() - 1; i >= 0; i--) {
			if (Character.isLetter(n.charAt(i))) {
				len++;
				flag = true;
			} else {
				if (flag == true)
					return len;
			}
		}
		return len;
	}

	// Method 3
	public int calculate_3(final String n) {
		String word = "";
		List<String> list = new ArrayList<>();
		for (char c : n.toCharArray()) {
			if (c == ' ') {
				// list.add(word);
				word = "";
			} else {
				word += c;
			}
			list.add(word);
		}
		System.out.println("ok" + list.get(list.size() - 1));
		return list.get(list.size() - 1).length();
	}

	public static void main(String[] args) {
		String name = "Kavya K Kamath";
		LengthOfWord obj = new LengthOfWord();
		System.out.println("Initial value:" + name);
		System.out.println("Final value:" + obj.calculate(name));
		System.out.println("Final value:" + obj.calculate_2(name));
		System.out.println("Final value:" + obj.calculate_3(name));
	}
}
