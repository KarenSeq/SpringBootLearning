package com.example.learnSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller use here as to serve HTML page. @RestController is for web services and returns Json response (=@Controller + @ResponseBody)
 * @author Karen
 *
 */
@Controller
public class ThymeLeafController {

	/**
	 * Serves index.html
	 * @return
	 */
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
}
