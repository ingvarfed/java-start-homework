package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework3a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int buffer = 0;
		for (int i = 1; i <= 4; ++i) {
			System.out.print("Enter number " + i + ": ");
			buffer = sc.nextInt();
			max = (max > buffer) ? max : buffer;
		}
		sc.close();
		System.out.println(max + " is the highest number.");
	}

}
