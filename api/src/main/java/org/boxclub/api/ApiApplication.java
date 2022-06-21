package org.boxclub.api;

import org.boxclub.core.PackageRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static PackageRequest main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}
