package com.javacompleto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.curso.entitites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
