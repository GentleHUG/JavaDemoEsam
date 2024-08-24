package edu.java.javademoexam.services;

import edu.java.javademoexam.controllers.dto.SaveUserDto;
import edu.java.javademoexam.controllers.dto.UserDTO;
import edu.java.javademoexam.entities.User;
import edu.java.javademoexam.enums.Country;
import edu.java.javademoexam.mappers.UserMapper;
import edu.java.javademoexam.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final UserMapper userMapper;

	@Override
	public void save(SaveUserDto dto) {
		User user = userMapper.mapDTOToEntity(dto);
		userRepository.save(user);
	}

	@Override
	public List<UserDTO> findAll() {
		return userRepository.findAll().stream()
				.map(userMapper::mapEntityToDTO)
				.toList();
	}

	@Override
	public List<UserDTO> findByCountry(List<Country> countries) {
		return userRepository.findAll().stream()
				.filter(x -> countries.contains(x.getCountry()))
				.sorted(Comparator.comparing(x -> x.getCountry().toString()))
				.map(userMapper::mapEntityToDTO)
				.toList();
	}
}
