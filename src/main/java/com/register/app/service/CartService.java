package com.register.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.register.app.model.Cart;
import com.register.app.model.User;
import com.register.app.repository.CartRepository;


@Service
public class CartService {
    
    @Autowired
    private CartRepository repo;
    
    public Cart saveCart(Cart cart) {
        
        return repo.save(cart);
    }
public List<Cart> findByUserId(int userid)
{
	return repo.findByUserId(userid);
}


   public List<Cart> getAll() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }
    

   public List<Cart> showmyCart(int userId){

	    return repo.findByUserId(userId);
	}
    
  public Cart fetchCartByCode(int code)
  { System.out.println("hello service"+code);
	  return repo.findByFoodId(code);
  }
 
//public Cart  removeFromCart(int foodid)
//{
//	return repo.deleteById(foodid);
//	
//	
//}
  public void delete(Cart cart) {
      // c = findById(cart);
      repo.delete(cart);
  }


  public List<Cart> getCartProducts(int userId)
  {
      List<Cart> cartList = repo.findByUserId(userId);
      return cartList;
  }

}