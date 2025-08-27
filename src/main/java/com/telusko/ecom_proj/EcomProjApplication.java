package com.telusko.ecom_proj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcomProjApplication extends SpringBootServletInitializer {
    @Override
	protected SpringApplicationBuilder
	configure(SpringApplicationBuilder builder){
		return builder.sourcea(EcomProjApplication.class);
	}
	public static void main(String[] args) {
		SpringApplication.run(EcomProjApplication.class, args);
	}

}
