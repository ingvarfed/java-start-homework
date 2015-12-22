package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework3d {

	public static void main(String[] args) {
		System.out.print("Enter number n: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int factorial = 1;
		System.out.print(n + "! = ");
		for (int i = n; i > 1; --i) {
			factorial *= i;
			System.out.print(i + "*");
		}
		System.out.println("1 = " + factorial);
	}

}
