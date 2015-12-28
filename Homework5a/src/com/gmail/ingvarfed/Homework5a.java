package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the length of array: ");
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		sc.close();

		Random rng = new Random();
		int[] arr = new int[arrSize];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = rng.nextInt(100);
		}

		System.out.println(maxValueInArray(arr) + " is the highest value in " + Arrays.toString(arr));
	}
	
	/**Returns the highest number in integer array
	 * @param arr - array of integer numbers
	 * @return The highest element of the array
	 */
	static int maxValueInArray(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; ++i) {
			max = (max >= arr[i]) ? max : arr[i];
		}
		return max;
	}

}
