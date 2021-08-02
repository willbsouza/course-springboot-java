package com.javacompleto.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacompleto.curso.entitites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
