package com.jfcorugedo.products;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jfcorugedo.products.data.Product;

@RestController
@RequestMapping("/v1/products")
public class ProductsController {
	
	private ProductsRepository repository;
	
	public ProductsController(ProductsRepository repository) {
		this.repository = repository;
	}

	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Product> create(@RequestBody Product product) {
		
		return new ResponseEntity<>(repository.save(product), HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Product> getAll() {
		
		return repository.findAll();
				
	}
}
