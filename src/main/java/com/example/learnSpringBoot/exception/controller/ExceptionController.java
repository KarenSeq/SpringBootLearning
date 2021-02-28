package com.example.learnSpringBoot.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.learnSpringBoot.exception.AnotherCustomException;
import com.example.learnSpringBoot.exception.SomeCustomException;

/**
 * @author Karen The @ControllerAdvice is an annotation, to handle the
 *         exceptions globally.
 * 
 *         The @ExceptionHandler is an annotation used to handle the specific
 *         exceptions and sending the custom responses to the client.
 *
 */
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(value = SomeCustomException.class)
	public ResponseEntity<Object> toError(SomeCustomException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = AnotherCustomException.class)
	public ResponseEntity<Object> toError(AnotherCustomException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.FORBIDDEN);
	}

}
