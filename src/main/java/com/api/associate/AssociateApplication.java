package com.api.associate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AssociateApplication {
	public static void main(String[] args) {
		SpringApplication.run(AssociateApplication.class, args);
	}
}
