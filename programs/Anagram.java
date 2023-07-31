package com.programs;

import java.util.*;

class Anagram {
	public static void isAnagram(String str1, String str2) {
		boolean flag = false;
		if (str1.length() != str2.length()) {
			flag = false;
		} else {
			char[] c1 = str1.toLowerCase().toCharArray();
			char[] c2 = str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag = Arrays.equals(c1, c2);

		}
		if (flag) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("It is not Anagram");
		}
	}

	public static void main(String args[]) {
		isAnagram("keep", "peek");
		isAnagram("kavya", "Shreya");
	}
}