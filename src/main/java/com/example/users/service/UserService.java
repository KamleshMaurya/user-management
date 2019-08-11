package com.example.users.service;

import java.util.List;
import java.util.Optional;

import com.example.users.dto.UserDto;
import com.example.users.model.User;

public interface UserService {
	List<UserDto> getUsers();
	public Optional<User> findUserById(Long id);
	User createUser(User entityUser);
}
