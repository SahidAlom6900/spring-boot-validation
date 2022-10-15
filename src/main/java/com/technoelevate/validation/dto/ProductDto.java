package com.technoelevate.validation.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductDto {
	private long productId;
	@NotNull
	private String productName;
	@NotNull
	private Double price;
}
