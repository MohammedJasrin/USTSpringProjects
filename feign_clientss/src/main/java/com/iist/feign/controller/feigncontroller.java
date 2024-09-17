package com.iist.feign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iist.feign.interfac.feignInterface;
import com.iist.feign.model.Product;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/client")
public class feigncontroller {

		 @Autowired
		 private feignInterface feignclient;
		 @CircuitBreaker(name="client-cb",fallbackMethod = "generateResponse")
		 @GetMapping("/allProducts")
		 public List<Product> getAll() {
			  return feignclient.getProducts();
		 }
		 
		 //@GetMapping
			/*
			 * @RequestMapping("/default") public String Welcome() { String
			 * port=environment.getProperty("server.port"); return
			 * "Programming Mycroserver port number is "+port; }
			 */
		 @GetMapping("/products-by-id/{id}")
		 public Product getProductById(@PathVariable ("id") int id) {
			   System.out.println(id);
			   return feignclient.getProductsById(id);
		 }
//		 @GetMapping("/products-by-category/{category}")

//			public List<Product> getProductsByCategory(@PathVariable("category") String category){

//			           return feignclient.getProductsByCategory(category);

//		 }
		 
		 public String generateResponse(Throwable throwable) {
			 return "The server is unavailable temporarily, please tyye after some time";
			 
		 }

}
