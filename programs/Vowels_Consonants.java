package com.programs;

class Vowels_Consonants {
	public static void isCheck(String str) {
		str = str.toLowerCase();
		str = str.replaceAll(" ", "");
		int vow = 0, cons = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vow++;
			} else {
				cons++;
			}
		}
		System.out.println("count of vowels and consonantas are " + vow + " " + cons);
	}

	public static void main(String args[]) {
		isCheck("keep");
		isCheck("Kavya K Kamath");
	}
}
