package com.register.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "cart")

public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	private int foodId;
	private String foodName;
	private String foodDesc;
	private int foodPrice;
	private String foodImage;
	private int foodQty;
	private int userId;
	public Cart()
	{
		
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodDesc() {
		return foodDesc;
	}
	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public String getFoodImage() {
		return foodImage;
	}
	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}
	public int getFoodQty() {
		return foodQty;
	}
	public void setFoodQty(int foodQty) {
		this.foodQty = foodQty;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Cart(int cartId, int foodId, String foodName, String foodDesc, int foodPrice, String foodImage, int foodQty,
			int userId) {
		super();
		this.cartId = cartId;
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodDesc = foodDesc;
		this.foodPrice = foodPrice;
		this.foodImage = foodImage;
		this.foodQty = foodQty;
		this.userId = userId;
	}
	
	
}