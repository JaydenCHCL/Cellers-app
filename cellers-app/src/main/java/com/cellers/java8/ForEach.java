package com.cellers.java8;

import java.util.ArrayList;
import java.util.List;


public class ForEach {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.forEach(System.out::println);
		list.forEach((x)->System.out.println(x));

	}

}
