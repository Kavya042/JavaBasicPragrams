package com.programs;

import java.util.*;

class ListReversal {
	public static void main(String args[]) {
		List<String> myList = new ArrayList<String>();// for numbers change datatype to Ineteger
		myList.add("Kavya");
		myList.add("K");
		myList.add("Kamath");
		Collections.reverse(myList);
		System.out.println("List after reversal " + myList);

		List<Integer> myList2 = new ArrayList<>(Arrays.asList(1, 2, 3));
		myList2.add(10);
		myList2.add(20);
		myList2.add(30);
		Collections.reverse(myList2);
		System.out.println("List after reversal " + myList2);

		List<Integer> myList3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		for (int k = 0, j = myList3.size() - 1; k < j; k++) {
			myList3.add(k, myList3.remove(j));
		}
		System.out.println("List after reversal " + myList3);
	}
}
