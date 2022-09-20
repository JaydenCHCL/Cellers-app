package com.cellers.app;

import java.util.*;

public class ProblemOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Please enter an int value for x: ");
		int x = scan.nextInt();
		System.out.print("Now enter a non-zero int value for y: ");
		int y = scan.nextInt();

		System.out.println("x + y = " + (x + y)); //arithmetic operations
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + (x / y));
		System.out.println("x < y is " + (x < y)); //relational operations
		System.out.println("x > y is " + (x > y));
		System.out.println("x <= y is " + (x <= y));
		System.out.println("x >= y is " + (x >= y));
		System.out.println("x = y is " + (x == y));
		System.out.println("x >> y = " + (x >> y));
		System.out.println("x << y = " + (x << y));
		System.out.println("x is now " + (--x));  //unary operations
		System.out.println("y is still " + (y++));
		System.out.println("y is now " + y);
		System.out.println("x & y = " + (x & y)); //logical operations
		System.out.println("x & y = " + (x | y));

		scan.close();
	}

}
