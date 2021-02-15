package com.example.learnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Karen
 * 
 * This is the entry point of the spring boot application to start.
 * 
 * @SpringBootApplication = @Configuration (This annotation is not specific to the spring boot applications. 
 * This annotation tags the class as the source for bean definitions.
 *  In short, this annotation is used for defining beans using the Java configuration.
 * + @EnableAutoConfiguration( automatically configures your application based on the dependencies 
 * you have added to the project) 
 * + @ComponentScan(scan for beans)
 *
 */
@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("In main method");
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
