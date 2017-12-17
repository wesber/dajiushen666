package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Company;
import com.example.demo.domain.Detail;
import com.example.demo.domain.Role;
import com.example.demo.domain.User;


public interface DetailDao extends JpaRepository<Detail, Long>{
	public Detail findById(int id);
}
