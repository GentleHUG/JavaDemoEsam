package edu.java.javademoexam.controllers.dto;

import edu.java.javademoexam.enums.Country;
import lombok.Builder;

@Builder
public record UserDTO (
	Long id,
	String firstName,
	Integer age,
	Country country
) {
}
