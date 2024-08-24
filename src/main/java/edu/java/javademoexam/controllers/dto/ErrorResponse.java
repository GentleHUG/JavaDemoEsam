package edu.java.javademoexam.controllers.dto;

import org.springframework.http.HttpStatus;

public record ErrorResponse(
		HttpStatus status,
		String reason
) {
}
