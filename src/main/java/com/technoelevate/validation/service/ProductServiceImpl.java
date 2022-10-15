package com.technoelevate.validation.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.technoelevate.validation.dto.ProductDto;
import com.technoelevate.validation.entity.Product;
import com.technoelevate.validation.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Validated
public class ProductServiceImpl implements ProductService {
	private final ProductRepository productRepository;
	private final ObjectMapper objectMapper;

	@Override
	public String addProduct(ProductDto productDto) {
		try {
			Product product = objectMapper.readValue(objectMapper.writeValueAsBytes(productDto), Product.class);
			productRepository.save(product);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "product added";
	}

	@Override
	public String test() {
		ObjectMapper mapper = new ObjectMapper();
		List<String> list=new ArrayList<>();
		
		Product product2 = productRepository.findById(1l).orElse(null);
		if (product2!=null) {
			String name = product2.getProductName();
			try {
				list=mapper.readValue(name, new TypeReference<List<String>>() {
				});
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		
		String val ="{\"id\":"+123+",\"key\":"+"abc"+"}";
		list.add(val);
		String values ="";
		try {
			 values = mapper.writeValueAsString(list);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Product product = new Product(0, values, 1234);
		productRepository.save(product);
		return null;
	}

	@Override
	public List<Product> testAll() {
		return productRepository.findAll();
	}
}
