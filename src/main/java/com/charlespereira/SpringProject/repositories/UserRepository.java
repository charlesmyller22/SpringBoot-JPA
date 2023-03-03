package com.charlespereira.SpringProject.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.charlespereira.SpringProject.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	
}
