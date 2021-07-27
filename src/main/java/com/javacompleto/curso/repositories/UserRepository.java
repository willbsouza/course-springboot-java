package com.javacompleto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.curso.entitites.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
