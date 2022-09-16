package com.register.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.register.app.model.User;

public interface RegistrationRepository extends JpaRepository<User, Integer> {

	public User findByEmailId(String email);

	public User findByEmailIdAndPassword(String tempEmailId, String tempPass);
}
