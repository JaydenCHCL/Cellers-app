package com.cellers.app;

public class ProblemTwo {

	public static void main(String[] args) {
		System.out.println("Using command line arguments to determine is odd/even");
		int argNum;
		for (String arg : args) {
			argNum = Integer.parseInt(arg);
			if (argNum % 2 == 0) {
				System.out.println(argNum + " is even");
			} else {
				System.out.println(argNum + " is odd");
			}
		}
	}
}
