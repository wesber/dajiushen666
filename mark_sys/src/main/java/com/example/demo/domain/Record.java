package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Record {
	@Id
	@GeneratedValue
	private int id;
	private String radioUrl;
	private String bixbyText;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRadioUrl() {
		return radioUrl;
	}
	public void setRadioUrl(String radioUrl) {
		this.radioUrl = radioUrl;
	}
	public String getBixbyText() {
		return bixbyText;
	}
	public void setBixbyText(String bixbyText) {
		this.bixbyText = bixbyText;
	}
	
}
