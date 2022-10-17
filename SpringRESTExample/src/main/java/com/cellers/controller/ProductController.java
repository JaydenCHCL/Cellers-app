package com.cellers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cellers.model.Product;

@RestController
public class ProductController {

	@GetMapping("/")
	public String getDisplay() {
		return "display";
	}

	@Autowired
	private Product product;

	@GetMapping("/getProductByName")
	public Product getProducts(@RequestParam(name = "id") Integer id, @RequestParam(name = "name") String name) {
		product.setPrdId(id);
		product.setPrdName(name);
		return product;
	}

	@PutMapping("/updateProduct")
	public Product updateProduct(@RequestBody Product prd) {
		product.setPrdName(prd.getPrdName());

		return product;
	}

}