package com.gmail.ingvarfed;

import java.util.Scanner;

public class HomeworkOne {

	public static void main(String[] args) {
		System.out.println("Enter the 5-digit integer number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		System.out.println((number/10000)%10);
		System.out.println((number/1000)%10);
		System.out.println((number/100)%10);
		System.out.println((number/10)%10);
		System.out.println((number)%10);
	}

}
