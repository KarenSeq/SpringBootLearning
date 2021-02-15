package com.example.learnSpringBoot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;



/**
 * @author Karen
 * @Order specifies the order in which the runners have to be executed
 *
 */
@Component
@Order(2)
public class ApplicationRunnerBean implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("In run method of Application Runner");
		
	}

}
