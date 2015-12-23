package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4bb {

	public static void main(String[] args) {
		System.out.print("Enter array length: ");
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();
		sc.close();
		Random rnd = new Random();
		int[] array = new int[arrLength];
		for (int i = 0; i < array.length; ++i) {
			array[i] = rnd.nextInt(10);
		}
		System.out.println(Arrays.toString(array));
		int temp = 0;
		for (int i = 0; i < (array.length / 2); ++i) {
			temp = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}

}
