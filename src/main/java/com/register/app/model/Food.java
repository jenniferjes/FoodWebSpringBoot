package com.register.app.model;

import java.awt.Image;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Food {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int foodId;
	private String foodImage;
	private String foodDesc;
	private String foodName;
	private int foodPrice;
	private int foodQuantity;
	public Food(int foodId, String foodImage, String foodDesc, String foodName, int foodPrice, int foodQuantity) {
		
		this.foodId = foodId;
		this.foodImage = foodImage;
		this.foodDesc = foodDesc;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodQuantity = foodQuantity;
	}
	
	public Food()
	{
		
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodImage() {
		return foodImage;
	}
	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}
	public String getFoodDesc() {
		return foodDesc;
	}
	public void setFoodDesc(String foodDesc) {
		this.foodDesc = foodDesc;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getFoodQuantity() {
		return foodQuantity;
	}
	public void setFoodQuantity(int foodQuantity) {
		this.foodQuantity = foodQuantity;
	}
	
	
}
