package com.technoelevate.validation.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.technoelevate.validation.dto.ProductDto;
import com.technoelevate.validation.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/product")
public class ProductController {
	
	private final ProductService productService;
	
	
	@PostMapping
	public String addProduct(@RequestBody @Valid ProductDto productDto,@RequestParam int id) {
		return productService.addProduct(productDto);
	}
	
	@GetMapping
	public List<?> allProduct() {
		return productService.testAll();
	}
	
	@PostMapping("test")
	public String test() {
		return productService.test();
	}

}
