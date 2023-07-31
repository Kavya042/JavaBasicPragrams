package com.programs;

class NumberOfOcc {
	public static void main(String args[]) {
		String str = "Kavya K Kamath";
		char search = 'a';
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == search) {
				count++;
			}
		}
		System.out.println(count);
	}
}
