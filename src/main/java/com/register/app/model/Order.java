package com.register.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
	
	private int userId;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private int foodPrice;
	private int foodTotal;
	private String foodName;
	private int foodQuantity;

	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Order(int userId, int foodPrice, int foodTotal, String foodName, int foodQuantity) {
		super();
		this.userId = userId;
		this.foodPrice = foodPrice;
		this.foodTotal = foodTotal;
		this.foodName = foodName;
		this.foodQuantity = foodQuantity;
	}



	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getFoodPrice() {
		return foodPrice;
	}

	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}

	public int getFoodTotal() {
		return foodTotal;
	}

	public void setFoodTotal(int foodTotal) {
		this.foodTotal = foodTotal;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getFoodQuantity() {
		return foodQuantity;
	}

	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	

}
