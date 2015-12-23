package com.gmail.ingvarfed;

import java.util.Arrays;

public class Homework4a {

	public static void main(String[] args) {
		int[] array = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int oddCounter = 0;
		for (int i : array) {
			if (i % 2 == 1) {
				++oddCounter;
			}
		}
		System.out.println(Arrays.toString(array) + " has " + oddCounter + " odd numbers.");
	}

}
