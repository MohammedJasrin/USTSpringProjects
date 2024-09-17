package com.iist.restjpa.model.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iist.restjpa.model.entity.Product;
import com.iist.restjpa.model.services.productService;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/product/api.1.0")
public class ProductController {
	@Autowired
	productService service;
	@GetMapping("/fetch/{id}")
	public ResponseEntity<?> fetch(@PathVariable Long id){
		return ResponseEntity.ok().body(service.fetch1(id));
	}
	@GetMapping("/fetchAll")
	public ResponseEntity<?> fetchAll(){
		return ResponseEntity.status(HttpStatus.OK).body(service.fetchAll());
	}
	@PostMapping
	@RequestMapping(path="/create", 
	consumes=MediaType.APPLICATION_JSON_VALUE,
	produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> createProduct(@RequestBody Product productReq){
		Product newProduct= service.saveP(productReq);
		return new ResponseEntity<Product>(newProduct, HttpStatus.CREATED);
	
		
	}
	@GetMapping("/deleteById/{id}")
	public ResponseEntity<Product> delete(@PathVariable Long id)
	{
		Optional<Product> deleteProduct=service.deleteById(id);
		return new ResponseEntity<Product>(deleteProduct.get(),HttpStatus.OK);
	}
	
	@PostMapping("/updateById/{id}")
	public ResponseEntity<?> update(@RequestBody Product product){
		service.deleteById(product.getProduct_id());
		Product newProduct=service.saveP(product);
		return new ResponseEntity<Product>(newProduct,HttpStatus.CREATED);
	}
}
