package com.register.app.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.register.app.model.Cart;
import com.register.app.model.Order;
public interface OrderRepository extends JpaRepository<Order, Integer>  {

	List<Order> findByUserId(int userid);
	Order save(Order order);
}
