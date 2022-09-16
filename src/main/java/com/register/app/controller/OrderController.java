package com.register.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.register.app.service.OrderService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class OrderController {
	
    @Autowired
	private OrderService service;

}
