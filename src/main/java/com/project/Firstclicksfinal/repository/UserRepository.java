package com.project.Firstclicksfinal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Firstclicksfinal.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	Optional<User> findOneByEmail(String email);
	
	boolean existsByEmail(String email);
}
