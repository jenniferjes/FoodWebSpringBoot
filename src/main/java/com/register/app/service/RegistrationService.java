package com.register.app.service;import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.register.app.model.User;
import com.register.app.repository.RegistrationRepository;

@Service

public class RegistrationService {

	   @Autowired
	private RegistrationRepository repo;

	public User saveUser(User user) {
		System.out.println("hello save");
		return repo.save(user);
	}
	
	public User  fetchUserByEmailId(String email)
	{
		return repo.findByEmailId(email);
	}


	public User fetchUserByEmailIdAndPassword(String tempEmailId, String tempPass) {
		// TODO Auto-generated method stub
		return repo.findByEmailIdAndPassword(tempEmailId,tempPass);

}
}
