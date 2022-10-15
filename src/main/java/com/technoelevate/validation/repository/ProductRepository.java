package com.technoelevate.validation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.validation.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
