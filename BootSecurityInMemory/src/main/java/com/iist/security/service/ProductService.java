package com.iist.security.service;

import java.util.List;

import com.iist.security.controller.*;
import com.iist.security.employee.Product;

public interface ProductService {
	List<Product> findAll();
	Product findById(int id);
	List<Product> findByCategory(String category);

}
