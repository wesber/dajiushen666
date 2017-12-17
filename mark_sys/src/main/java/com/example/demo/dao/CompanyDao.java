package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Company;
import com.example.demo.domain.Role;
import com.example.demo.domain.User;


public interface CompanyDao extends JpaRepository<Company, Long>{
}
