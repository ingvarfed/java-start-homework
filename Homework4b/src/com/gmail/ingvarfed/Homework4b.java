package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4b {

	public static void main(String[] args) {
		System.out.print("Enter array length: ");
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		if (arrLength > 0) {
			int[] array = new int[arrLength];
			for (int i = 0;; i = 0) {
				System.out.print("What element whould you like to enter (0-" + (array.length - 1) + "): ");
				i = sc.nextInt();
				if ((i >= 0) && (i <= (array.length - 1))) {
					System.out.print("What is the value of element " + i + ": ");
					array[i] = sc.nextInt();
				} else {
					System.out.println("Out of range.");
					break;
				}
			}
			sc.close();
			System.out.println("The final array: " + Arrays.toString(array));
		} else {
			System.out.println("Can not creat array with the length " + arrLength);
		}
		sc.close();
	}

}
