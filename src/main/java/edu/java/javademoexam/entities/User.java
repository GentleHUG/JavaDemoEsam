package edu.java.javademoexam.entities;

import edu.java.javademoexam.enums.Country;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Getter
@NoArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String firstName;

	private Integer age;

	@Enumerated(EnumType.STRING)
	private Country country;

	public User(String firstName, Integer age, Country country) {
		this.firstName = firstName;
		this.age = age;
		this.country = country;
	}
}
