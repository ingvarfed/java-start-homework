package com.gmail.ingvarfed;

public class Homework3dd {

	public static void main(String[] args) {
		System.out.println("Enjoy all prime numbers from 1 to 100:");
		for (int i = 1; i <= 100; ++i){
			boolean primeCheck = true;
			for (int j = 2; j < i; ++j){
				if (i%j == 0){
					primeCheck = false;
					break;
				}
			}
			if (primeCheck){
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}
