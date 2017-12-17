package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;


public interface RoleDao extends JpaRepository<Role, Long>{
	public List<Role> findByUsers_Name(String name);
}
