package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;


public interface UserDao extends JpaRepository<User, Long>{
	public List<User> findByName(String name);
}
