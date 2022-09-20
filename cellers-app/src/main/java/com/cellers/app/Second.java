package com.cellers.app;

public class Second {
	int id;
	String name;

	public static void main(String[] args) {
		Second s1 = new Second();
		Second s2 = new Second();
		s1.id = 1;
		s1.name = "Jayden";
		s2.id = 2;
		s2.name = "Tyler";
		
		s1.insertRecords(3, "Kourtland");
		s2.insertRecords(4, "James");
		
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
		s1.show();
		s2.show();
	}
	
	void insertRecords(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void show() {
		System.out.println(id + " " + name);
	}
}
