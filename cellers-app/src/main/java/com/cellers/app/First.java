package com.cellers.app;

public class First {
	
	int x = 10; //instance variable
	static int z = 30; //static variable
	
	public static void main(String[] args) {
		int y = 20; //local variable
		
		First f = new First();
		
		System.out.println(f.x);
		System.out.println(y);
		System.out.println(z);
	}

}
