package com.javacompleto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.curso.entitites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
