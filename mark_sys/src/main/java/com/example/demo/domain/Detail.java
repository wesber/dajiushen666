package com.example.demo.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Detail {
	@Id
	@GeneratedValue
	private int id;
	private String radioUrl;
	private String bixbyText;
	private String engine1Text;
	private String engine2Text;
	private boolean similality;
	private String comments;
	private String reviewedText;
	@ManyToOne
	private User reviewer;
	private Date reviewDate;
	@ManyToOne
	private User inspector;
	private Date inspectDate;
	private String inspectReject;
	@ManyToOne
	private User administor;
	private Date adminDate;
	private String adminReject;
	private String status;
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
	public String getEngine1Text() {
		return engine1Text;
	}
	public void setEngine1Text(String engine1Text) {
		this.engine1Text = engine1Text;
	}
	public String getEngine2Text() {
		return engine2Text;
	}
	public void setEngine2Text(String engine2Text) {
		this.engine2Text = engine2Text;
	}
	public boolean isSimilality() {
		return similality;
	}
	public void setSimilality(boolean similality) {
		this.similality = similality;
	}
	@Enumerated(EnumType.STRING)
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getReviewedText() {
		return reviewedText;
	}
	public void setReviewedText(String reviewedText) {
		this.reviewedText = reviewedText;
	}
	public User getReviewer() {
		return reviewer;
	}
	public void setReviewer(User reviewer) {
		this.reviewer = reviewer;
	}
	public Date getReviewDate() {
		return reviewDate;
	}
	public void setReviewDate(Date reviewDate) {
		this.reviewDate = reviewDate;
	}
	public User getInspector() {
		return inspector;
	}
	public void setInspector(User inspector) {
		this.inspector = inspector;
	}
	public Date getInspectDate() {
		return inspectDate;
	}
	public void setInspectDate(Date inspectDate) {
		this.inspectDate = inspectDate;
	}
	public String getInspectReject() {
		return inspectReject;
	}
	public void setInspectReject(String inspectReject) {
		this.inspectReject = inspectReject;
	}
	public User getAdministor() {
		return administor;
	}
	public void setAdministor(User administor) {
		this.administor = administor;
	}
	public Date getAdminDate() {
		return adminDate;
	}
	public void setAdminDate(Date adminDate) {
		this.adminDate = adminDate;
	}
	public String getAdminReject() {
		return adminReject;
	}
	public void setAdminReject(String adminReject) {
		this.adminReject = adminReject;
	}
	@Column
	@Enumerated(EnumType.STRING)
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
}
