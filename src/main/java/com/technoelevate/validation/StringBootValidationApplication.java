package com.technoelevate.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class StringBootValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringBootValidationApplication.class, args);
	}

	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

}
