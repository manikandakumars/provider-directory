package com.providerdirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@ComponentScan(basePackages = {"com.providerdirectory.resource","com.providerdirectory.resource.impl",
								"com.providerdirectory.service","com.providerdirectory.service.impl",
								"com.providerdirectory.repo","com.providerdirectory.repo.impl"})
*/
@SpringBootApplication
@Configuration
public class ProviderDirectoryApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ProviderDirectoryApplication.class, args);
	}

}
