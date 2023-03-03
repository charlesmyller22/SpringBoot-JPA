package com.charlespereira.SpringProject.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.charlespereira.SpringProject.entities.User;
import com.charlespereira.SpringProject.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "9909090", "1234");
		User u2 = new User(null, "Charles Pereira", "charles@gmail.com", "9909090", "1234");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
}
