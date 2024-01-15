package com.example.backMobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.backMobile.Entity")
public class BackMobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackMobileApplication.class, args);
	}

}
