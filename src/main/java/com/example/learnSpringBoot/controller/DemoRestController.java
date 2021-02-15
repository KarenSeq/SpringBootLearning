package com.example.learnSpringBoot.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.learnSpringBoot.model.Person;

/**
 * @author Karen
 * @RestController(used to define RESTful web services)  = @Controller + @ResponseBody
 *
 */
@RestController
public class DemoRestController {
	
	@RequestMapping(value = "/name")
	public String displayName() {
		return "Karen";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addPerson(@RequestBody Person person) {
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

}
