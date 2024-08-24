package edu.java.javademoexam.controllers.dto;

import edu.java.javademoexam.enums.Country;

public record SaveUserDto (
	String firstName,
	Integer age,
	Country country
) {
}
