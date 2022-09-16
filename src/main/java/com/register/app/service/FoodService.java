package com.register.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.app.model.Food;
import com.register.app.repository.FoodRepository;


@Service
public class FoodService {

	 @Autowired
		private FoodRepository repo;
	 
	 
	public   List<Food> getAll()
	{
	
	return repo.findAll();
	}
	
	}
