package com.google.ingvarfed;

import java.util.Scanner;

public class Homework3cc {

	public static void main(String[] args) {
		System.out.print("Enter max: ");
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		sc.close();
		int count = 1;
		boolean riseToken = true;
		for (int i = 1;;) {
			if (i == max) {
				riseToken = false;
			} else if (i == 0) {
				break;
			}
			if (count <= i) {
				System.out.print("*");
				++count;
			} else {
				System.out.println();
				i += (riseToken) ? (1) : (-1);
				count = 1;
			}
		}
	}

}
