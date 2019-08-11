package com.example.users.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.users.dto.UserDto;
import com.example.users.model.User;
import com.example.users.repository.UserRepository;
import com.example.users.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserDto> getUsers() {
		return userRepository.findAll().stream().map(u -> u.toUserDto()).collect(Collectors.toList());
	}

	@Override
	public Optional<User> findUserById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User createUser(User entityUser) {
		entityUser = userRepository.save(entityUser);
		return entityUser;
	}

}
