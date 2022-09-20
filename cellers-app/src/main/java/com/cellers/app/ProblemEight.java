package com.cellers.app;

public class ProblemEight {

	public static void main(String[] args) {
		System.out.println("Printing odd numbers from 50-100 using do..while");
		int i = 50;
		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		} while (i <= 100);
	}
}
