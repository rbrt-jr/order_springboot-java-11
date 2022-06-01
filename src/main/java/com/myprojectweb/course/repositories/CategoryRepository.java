package com.myprojectweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojectweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
