package com.register.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.register.app.model.User;
import com.register.app.service.RegistrationService;

@RestController
public class RegistrationController {
	@Autowired
	private RegistrationService service;
	
	@PostMapping("/registeruser")
    @CrossOrigin(origins = "http://localhost:4200")



   public User registerUsers(@RequestBody User user) throws Exception {
        
        String tempEmailId = user.getEmailId();
        
        if(tempEmailId != null && !"".equals(tempEmailId))
        {
        User userObj =    service.fetchUserByEmailId(tempEmailId);
        if(userObj != null) {
            throw new Exception("user with "+tempEmailId+" is already exists");
        }
        }
        System.out.println("hellooooregis");
        User userObj = null;
        
        userObj = service.saveUser(user);
        return userObj;
    }
    
	
	@PostMapping("/login")
	 
	@CrossOrigin(origins="http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception
	{
		String tempEmailId=user.getEmailId();
		String tempPass=user.getPassword();
		User userObj=null;
		if(tempEmailId!=null && tempPass!=null) {
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
			System.out.println(userObj);
			//System.out.println(userObj.getUserName());
		}
		if(userObj==null)
		{
			throw new Exception("Bad Credentials");
		}
		return userObj;
		
	}

}
