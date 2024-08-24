package edu.java.javademoexam.controllers;

import edu.java.javademoexam.controllers.dto.SaveUserDto;
import edu.java.javademoexam.controllers.dto.UserDTO;
import edu.java.javademoexam.enums.Country;
import edu.java.javademoexam.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

	private final String USERS = "/user-api/v1/users";
	private final String ADDITIONAL = "/user-api/v1/additional-info";

	private final UserService userService;

	@GetMapping(USERS)
	public ResponseEntity<List<UserDTO>> getAllUsers() {
		return ResponseEntity.ok(userService.findAll());
	}

	@PostMapping(USERS)
	public ResponseEntity<?> postUser(@RequestBody SaveUserDto saveUserDto) {
		userService.save(saveUserDto);
		return ResponseEntity.ok().build();
	}

	@GetMapping(ADDITIONAL)
	public ResponseEntity<List<UserDTO>> getAdditionalInfo(@RequestParam List<Country> countries) {
		return ResponseEntity.ok(userService.findByCountry(countries));
	}
}
