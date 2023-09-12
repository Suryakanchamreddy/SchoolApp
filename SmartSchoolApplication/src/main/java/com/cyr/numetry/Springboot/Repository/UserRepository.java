package com.cyr.numetry.Springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cyr.numetry.Springboot.Model.User;
@Repository

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
	

}
