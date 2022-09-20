package com.cellers.JavaDay3;

public class Tester {

	public static void main(String[] args) {
		/* Student s1 = new Student();
		System.out.println(s1.input("Jayden"));
		System.out.println(s1.average(40, 10, 50));
		Bank b1 = new Bank();
		System.out.println(b1.deposit(1000, 80));
		System.out.println(b1.withdraw(100, 95));
		System.out.println(b1.withdraw(100, 105));*/
		Truck myTruck = new Truck();
		myTruck.setColor("Blue");
		myTruck.setLoadingCapacity("1000 Tons");
		System.out.println(myTruck.toString());
		
	}

}
