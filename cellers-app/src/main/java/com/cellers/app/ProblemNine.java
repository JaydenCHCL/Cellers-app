package com.cellers.app;

public class ProblemNine {

	public static void main(String[] args) {
		System.out.println("Printing out all prime numbers from 1-100");
		for (int i = 1; i <= 100; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				System.out.println(i);
				;
			}
		}
	}
}
