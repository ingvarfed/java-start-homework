package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework3c {

	public static void main(String[] args) {
		System.out.print("Enter number of stripes: ");
		Scanner sc = new Scanner(System.in);
		int stripes = sc.nextInt();
		sc.close();
		System.out.println();
		for (int i = 0; i < 5; ++i) {
			for (int j = 0; j < stripes; ++j) {
				if ((j % 2) == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
	}

}
