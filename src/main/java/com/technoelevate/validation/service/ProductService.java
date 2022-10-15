package com.technoelevate.validation.service;

import java.util.List;

import com.technoelevate.validation.dto.ProductDto;
import com.technoelevate.validation.entity.Product;

public interface ProductService {
	
	String addProduct(ProductDto productDto);

	String test();
	
	List<Product> testAll();

}
