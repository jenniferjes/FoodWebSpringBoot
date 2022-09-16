package com.register.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.app.model.Cart;
import com.register.app.model.Food;
import com.register.app.model.Order;
import com.register.app.repository.OrderRepository;





@Service
public class OrderService { 

	
	
	    @Autowired
		private OrderRepository repos;
	 
	 

}
