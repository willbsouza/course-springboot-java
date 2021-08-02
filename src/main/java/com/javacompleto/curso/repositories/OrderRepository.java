package com.javacompleto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.curso.entitites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
