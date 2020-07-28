package com.springboot.tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = com.springboot.tutorial.repository.EmployeeRepository.class)
public class CreateEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateEmployeeApplication.class, args);
	}

}
