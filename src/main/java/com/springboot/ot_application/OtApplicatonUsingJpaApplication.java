package com.springboot.ot_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan("com.springboot.ot_application.Entity") 
//@EnableJpaRepositories("com.springboot.ot_application.Repository")
public class OtApplicatonUsingJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OtApplicatonUsingJpaApplication.class, args);
		
		System.out.println("Done!");

	
	}

}
