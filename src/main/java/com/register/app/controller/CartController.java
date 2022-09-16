package com.register.app.controller;
import java.util.Collection;
import java.util.List;

import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.register.app.model.Cart;
import com.register.app.model.User;
import com.register.app.service.CartService;
@RestController

public class CartController {
	
	@Autowired
	
	private CartService service;
	
	@PostMapping("/addToCart")
	
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Cart> addToCart(@RequestBody Cart cart)  {
				
//		 System.out.println("hellloo");
//		int code=cart.getFoodId(); 
//		 System.out.println("foodcode"+code);
//		int userid=cart.getUserId();
//		 System.out.println("userid"+userid);
//		Cart existsData=service.fetchCartByCode(code,userid);
//		System.out.println("existsdata"+existsData);
//		//List<Cart> list=service.findByUserId(userid);
//		//List<Integer> list2=list.stream().map(p->p.getFoodId()).collect(Collectors.toList()); 
//		
//		//System.out.println("quantity"+existsData.getFoodQty());
//		if(existsData==null)
//				{ 
//			return service.saveCart(cart);
//			
//			
//			
//		}else {
//			System.out.println("hellloooooo");
//			int oldqty=existsData.getFoodQty();
//			//Integer quantity=existsData.getFoodQty()+1;
//			existsData.setFoodQty(oldqty+cart.getFoodQty());
//			return service.saveCart(existsData);
//			
//		}
////		
		////////////////////
		Cart cartObj = null;
		System.out.println(cart.getFoodDesc());
		cartObj = service.saveCart(cart);
		return ResponseEntity.ok(cartObj);		
		
	}
	
	@PostMapping("/showCart")	

	@CrossOrigin(origins = "http://localhost:4200")
	public List<Cart> showCart(@RequestBody User user ){
		System.out.println("called");
		return service.showmyCart(user.getId());
	}
	

	@PostMapping("/delete")
	@CrossOrigin(origins = "http://localhost:4200")
	   public ResponseEntity<String> delete(@RequestBody Cart cart) {
	        service.delete(cart);
	        return new ResponseEntity<String>("Item is deleted successfully.!", HttpStatus.OK);
	    }
	
	
	   @PostMapping("/count")
	   @CrossOrigin(origins = "http://localhost:4200")
	    public ResponseEntity<Integer> getCartCountforUserId(@RequestBody User userdata)
	    {
	        int count=0;
	        int userId=userdata.getId();
	        System.out.println(userId);
	        List<Cart> cartList = service.getCartProducts(userId);
	        count=cartList.size();
	        
	        System.out.println(count);
	        return ResponseEntity.ok(count);
	        
	    }
	   
	   @PostMapping("/plus")
	   @CrossOrigin(origins = "http://localhost:4200")
	   public Cart plusButton(@RequestBody Cart cart)
	   {
		   int code=cart.getFoodId();
		   Cart existsData=service.fetchCartByCode(code);
		   if(code!=0 && "".equals(code))
		   {
			   if(existsData!=null)
			   {
				   Integer qty=existsData.getFoodQty()+1;
				   existsData.setFoodQty(qty);
//				   Integer price=existsData.getFoodPrice()+;
//				   existsData.setFoodPrice(price);
				   return service.saveCart(cart);
			   }
		   }
		   
		   
		return service.saveCart(cart);
		   
	   }
	   
	   @PostMapping("/minus")
	   @CrossOrigin(origins = "http://localhost:4200")
	   public Cart minusButton(@RequestBody Cart cart)
	   {
		   int code=cart.getFoodId();
		   Cart existsData=service.fetchCartByCode(code);
		   if(code!=0 && "".equals(code))
		   {
			   if(existsData!=null)
			   {
				   Integer qty=existsData.getFoodQty()-1;
//				   Integer oldPrice=existsData.getFoodPrice();
//				   Integer price=oldPrice-existsData.getFoodPrice();
				  // existsData.setFoodPrice(price);
				   if(qty>=1) {
				   existsData.setFoodQty(qty);
				   //existsData.setFoodPrice(price);
				   }
				   return service.saveCart(cart);
			   }
		   }
		   
		   
		return service.saveCart(cart);
		   
	   }
	   
	   
	   
}
