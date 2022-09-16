package com.register.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.register.app.model.Food;

public interface FoodRepository extends JpaRepository<Food, Integer> {

	

}
