package edu.java.javademoexam.mappers;

import edu.java.javademoexam.controllers.dto.SaveUserDto;
import edu.java.javademoexam.controllers.dto.UserDTO;
import edu.java.javademoexam.entities.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

	public UserDTO mapEntityToDTO(User user) {
		return UserDTO.builder()
				.id(user.getId())
				.firstName(user.getFirstName())
				.age(user.getAge())
				.country(user.getCountry())
				.build();
	}

	public User mapDTOToEntity(SaveUserDto dto) {
		return new User(
				dto.firstName(),
				dto.age(),
				dto.country()
		);
	}
}
