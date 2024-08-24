package edu.java.javademoexam.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> userAlreadyExistsHandle(Exception ignored) {
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
