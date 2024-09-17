package com.iist.feign.interfac;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.iist.feign.model.Product;

@FeignClient(value="feignclient",url="http://localhost:7071/product-service")

public interface feignInterface {

	

	@GetMapping("/products")

	List<Product> getProducts();

	

	@GetMapping(value="/products-by-id/{id}",produces="application/json")

	Product getProductsById(@PathVariable long id);

	

//	@GetMapping(value="products-bycategory/{category}",produces="application/json")

//	List<Product> getProductsByCategory{

//		@PathVariable("category")

//	}

	

}
