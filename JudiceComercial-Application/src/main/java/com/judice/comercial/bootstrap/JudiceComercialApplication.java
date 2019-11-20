package com.judice.comercial.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.judice.comercial"})
public class JudiceComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(JudiceComercialApplication.class, args);
	}
}