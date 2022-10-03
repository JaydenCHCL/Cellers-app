package com.cellers.java8;

public class LambdaExpressions {

	/*
	 * Lambda expressions provide implementation of functional interfaces
	 */
	interface Product {
		public void listOfProducts();
	}

	public static void main(String[] args) {

		String item = "Laptops";
		/*
		 * Product p = new Product() { public void listOfProducts() {
		 * System.out.println("List of Products " + item); };
		 * 
		 * };
		 * 
		 * p.listOfProducts();
		 */

		Product p = () -> {
			System.out.println("List of Products " + item);
		};
		p.listOfProducts();
	}
}
