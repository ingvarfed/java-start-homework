package com.gmail.ingvarfed;

import java.util.Scanner;

public class HomeworkThree {

	public static void main(String[] args) {
		System.out.println("Enter circle radius in units:");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		sc.close();
		System.out.println("Circle length is " + 2.0*Math.PI*radius + " units");
	}

}
