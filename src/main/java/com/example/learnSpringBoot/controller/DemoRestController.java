package com.example.learnSpringBoot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnSpringBoot.exception.AnotherCustomException;
import com.example.learnSpringBoot.exception.SomeCustomException;
import com.example.learnSpringBoot.model.Person;

/**
 * @author Karen
 * @RestController(used to define RESTful web services)  = @Controller + @ResponseBody
 *
 */
@RestController
public class DemoRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoRestController.class);
	
	@RequestMapping(value = "/name")
	public String displayName() {
		logger.info("In display name method");
		return "Karen";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPerson(@RequestBody Person person) {
		logger.info("In add person method");
		return "The name of the person is "+person.getFirstName()+" "+person.getLastName();
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public String updatePerson(@PathVariable("id") String id, @RequestBody Person person) {
		return "The name of person with id "+id+" is updated to "+person.getFirstName()+" "+person.getLastName();
	}
	
	@RequestMapping(value = "/update1/{id}", method = RequestMethod.PUT)
	public String updatePerson1(@PathVariable("id") String id, @RequestBody Person person) {
		return "The name of person with id "+id+" is updated to "+person.getFirstName()+" "+person.getLastName();
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deletePerson(@PathVariable("id") String id, @RequestBody Person person) {
		throw new SomeCustomException("Karen", "Bad Request");
	}
	
	@RequestMapping(value = "/delete1/{id}", method = RequestMethod.DELETE)
	public String deletePerson1(@PathVariable("id") String id, @RequestBody Person person) {
		throw new AnotherCustomException("User is not allowed to delete a person");
	}

}
