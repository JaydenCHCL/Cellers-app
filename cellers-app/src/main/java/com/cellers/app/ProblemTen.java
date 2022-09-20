package com.cellers.app;

public class ProblemTen {

	public static void main(String[] args) {
		System.out.println("Printing odd numbers from 1-100, using continue");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
