package com.gmail.ingvarfed;

import java.util.Scanner;

public class Homework3bb {

	public static void main(String[] args) {
		System.out.println("Triangle: A(0,0), B(4,4), C(6,1).");
		System.out.print("Enter X coordinate: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print("Enter Y coordinate: ");
		double y = sc.nextDouble();
		sc.close();
		if ((y >= x/6) && (y <= x) && (y <= -1.5*x+10)){
			System.out.println("The point (" + x + "," + y + ") is in the triangle.");
		}
		else {
			System.out.println("The point (" + x + "," + y + ") is not in the triangle.");
		}
	}

}
