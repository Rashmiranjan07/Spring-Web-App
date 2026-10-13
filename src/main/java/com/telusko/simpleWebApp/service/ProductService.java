package com.telusko.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.simpleWebApp.model.Product;
import com.telusko.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;

//	List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000),
//			new Product(102, "samsung", 20000), new Product(103, "sony camera", 70000)));

	public List<Product> getProducts() {
		return repo.findAll();

	}

	public Product getProductById(int prodId) {
		return repo.findById(null).orElse(null);
	}

	public void addProduct(Product prod) {
		repo.save(prod);
	}

	public void updateProduct(Product prod) {
		repo.save(prod);
	}

	public void deleteProduct(int prodId) {
		repo.deleteById(prodId);
	}

}
