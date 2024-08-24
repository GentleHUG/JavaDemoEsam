package edu.java.javademoexam.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Country {
	RUSSIA("RUSSIA"),
	USA("USA"),
	CHINA("CHINA"),
	INDIA("CHINA"),
	ITALY("ITALY");

	private final String name;
}
