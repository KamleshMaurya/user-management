package com.example.users.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.users.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User save(User user);
	Optional<User> findById(Long id);
}
