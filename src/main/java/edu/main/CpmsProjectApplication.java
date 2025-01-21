package edu.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CpmsProjectApplication {

	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("Category & product mangement system");
		SpringApplication.run(CpmsProjectApplication.class, args);
	}

}
