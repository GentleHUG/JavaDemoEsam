package edu.java.javademoexam.services;

import edu.java.javademoexam.controllers.dto.SaveUserDto;
import edu.java.javademoexam.controllers.dto.UserDTO;
import edu.java.javademoexam.enums.Country;

import java.util.List;

public interface UserService {

	void save(SaveUserDto dto);

	List<UserDTO> findAll();

	List<UserDTO> findByCountry(List<Country> country);
}
