package com.gmail.ingvarfed;

import java.util.Arrays;
import java.util.Random;

public class Homework4c {

	public static void main(String[] args) {
		int arrLength = 15;
		int[] arrayShort = new int[arrLength];
		Random rnd = new Random();
		for (int i = 0; i < arrayShort.length; i++) {
			arrayShort[i] = rnd.nextInt(100);
		}
		int[] arrayLong = new int[arrLength * 2];
		System.arraycopy(arrayShort, 0, arrayLong, 0, arrayShort.length);
		System.arraycopy(arrayShort, 0, arrayLong, arrayShort.length, arrayShort.length);
		for (int i = arrayShort.length; i < arrayLong.length; ++i) {
			arrayLong[i] *= 2;
		}
		System.out.println(Arrays.toString(arrayShort));
		System.out.println(Arrays.toString(arrayLong));
	}

}
