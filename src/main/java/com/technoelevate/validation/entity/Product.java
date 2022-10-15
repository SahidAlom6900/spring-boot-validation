package com.technoelevate.validation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "product_details"/* ,uniqueConstraints={@UniqueConstraint(columnNames={"productName"})} */)
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private long productId;
//	@Column(unique = true)
	private String productName;
//	@Column(unique = true)
	private double price;
}
