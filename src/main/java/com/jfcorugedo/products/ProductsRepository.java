package com.jfcorugedo.products;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jfcorugedo.products.data.Product;

public interface ProductsRepository extends MongoRepository<Product, String> {

	public java.util.List<Product> findAllByName(String name);
	
	public java.util.List<Product> findByPriceGreaterThan(double price);
}
