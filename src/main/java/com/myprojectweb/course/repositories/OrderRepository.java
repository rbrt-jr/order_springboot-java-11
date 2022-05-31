package com.myprojectweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojectweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
