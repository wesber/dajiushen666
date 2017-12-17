package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Permission {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToMany(mappedBy="permissions")
	private List<Role> roles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", roles=" + roles + "]";
	}
	
	
}
