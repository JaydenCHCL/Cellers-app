package com.cellers.mvc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Model-> Product class which as setter and getter methods

@Data
@AllArgsConstructor
@NoArgsConstructor
class Product {

	private int prdNo;
	private String prdName;

}

//View-> printing on the console

class ProductView {

	public void printProductDetails(int prdId, String prdName) {
		System.out.println("Product details");
		System.out.println(prdId);
		System.out.println(prdName);
	}

}

//Controller-> Navigation logic which has model and view
@Data
@AllArgsConstructor
@NoArgsConstructor
class ProductController {
	// HAS A
	private Product model;
	private ProductView view;

	public void updateView() {
		view.printProductDetails(model.getPrdNo(), model.getPrdName());
	}

}

public class Main {

	static Product getProductsFromDB() {
		Product p = new Product();
		p.setPrdNo(111);
		p.setPrdName("Laptop");
		return p;
	}

	public static void main(String[] args) {
		Product model = getProductsFromDB();
		ProductView view = new ProductView();

		ProductController controller = new ProductController(model, view);
		controller.updateView();

	}

}