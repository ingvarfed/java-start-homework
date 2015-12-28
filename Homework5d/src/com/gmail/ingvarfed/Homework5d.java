package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int arrSize = sc.nextInt();

		int[] arr = new int[arrSize];
		Random rng = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rng.nextInt(10);
		}
		System.out.println("The array is: " + Arrays.toString(arr));

		System.out.println("What value are you looking for?");
		int searchValue = sc.nextInt();
		sc.close();

		System.out.println(searchValue + " is in cell " + findValueInArray(arr, searchValue));
	}

	/**
	 * Linear search of a specific value in an integer array
	 * 
	 * @param arr
	 *            - the array
	 * @param searchValue
	 *            - the value
	 * @return The index of the first element that contains needed value; if
	 *         value is not present, returns -1
	 */
	static int findValueInArray(int[] arr, int searchValue) {
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] == searchValue) {
				return i;
			}
		}
		return -1;
	}

}
