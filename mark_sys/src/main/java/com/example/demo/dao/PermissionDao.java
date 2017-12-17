package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Permission;
import com.example.demo.domain.Role;
import com.example.demo.domain.User;


public interface PermissionDao extends JpaRepository<Permission, Long>{
	public List<Permission> findByRoles_Name(String name);
}
