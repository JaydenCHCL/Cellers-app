package com.cellers.app;

public class ProblemEleven {

	public static void main(String[] args) {
		System.out.println("Printing even numbers from 50-100 breaking at 75");
		for (int i = 50; i <= 100; i++) {
			if (i == 75) {
				break;
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
