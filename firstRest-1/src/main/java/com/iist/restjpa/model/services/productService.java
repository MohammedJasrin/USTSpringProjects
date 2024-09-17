package com.iist.restjpa.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iist.restjpa.model.entity.Product;
import com.iist.restjpa.model.repository.MyJpaRepository;

@Service
public class productService {
	@Autowired
	MyJpaRepository repository;
	public Optional<Product> fetch1(Long product_id)
	{
		Optional<Product> optional = repository.findById(product_id);
		if(optional.isPresent())
		{
			return optional;
		}
		else {
			return null;
		}
	}
	public Product saveP(Product product) {
		
		return repository.save(product);
	}
	public List<Product> fetchAll()
	{
		return repository.findAll();
		
	}
	public Optional<Product> deleteById(Long id) {
		Optional<Product> delprod = repository.findById(id);
		repository.deleteById(id);
		return delprod;
		
	}
}
