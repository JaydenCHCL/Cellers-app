package com.cellers.javaDay3;

public class Student {

	String name;

	public String average(int test1, int test2, int test3) {
		double avg = (test1 + test2 + test3) / 3;
		if (avg > 50.0) {
			return "Pass";
		} else {
			return "Fail";
		}
	}

	public String input(String name) {
		this.name = name;
		return name;
	}

}
