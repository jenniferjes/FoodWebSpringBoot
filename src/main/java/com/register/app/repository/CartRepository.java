package com.register.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.register.app.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	

public  List<Cart> findByUserId(int userid);
 

public Cart findByFoodId(int foodid);


}