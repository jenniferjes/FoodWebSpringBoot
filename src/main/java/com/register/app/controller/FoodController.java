package com.register.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.register.app.model.Food;
import com.register.app.service.FoodService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class FoodController {
	@Autowired
	private FoodService service;
	//private FoodService service;
	
	
	
//	public List<Food> displayFood()
//	{
//		return service.getAll();
//	}
	@PostMapping("/displayfood")
	
	public List<Food> getAllFood()
	{
		return service.getAll();
	}
    

}
