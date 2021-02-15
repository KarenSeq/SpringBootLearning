package com.example.learnSpringBoot.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AnotherCustomException extends RuntimeException{

	String message;
}
