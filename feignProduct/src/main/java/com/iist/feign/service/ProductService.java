package com.iist.feign.service;

import java.util.List;

import com.iist.feign.model.Product;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	List<Product> findByCategory(String category);

}
