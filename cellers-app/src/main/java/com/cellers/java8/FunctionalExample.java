package com.cellers.java8;

interface Vehicle{
	void speed(int x);
}

public class FunctionalExample implements Vehicle{

	@Override
	public void speed(int x) {
		System.out.println(x);
		
	}
	
	public static void main(String[] args) {
		FunctionalExample f = new FunctionalExample();
		f.speed(100);
	}

}
