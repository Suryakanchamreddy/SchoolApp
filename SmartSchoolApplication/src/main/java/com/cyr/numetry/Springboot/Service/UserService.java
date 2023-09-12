package com.cyr.numetry.Springboot.Service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cyr.numetry.Springboot.Model.User;
import com.cyr.numetry.Springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	
	User save(UserRegistrationDto registrationDto);

}
