package com.shardabootcamp.campusplacement.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "jobseeker")
public class Jobseeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private List<Skills> jobSkills;
	private String resume;
	public Jobseeker(Long id, String name, String email, String phone, List<Skills> jobSkills, String resume) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.jobSkills = jobSkills;
		this.resume = resume;
	}
	public Jobseeker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<Skills> getJobSkills() {
		return jobSkills;
	}
	public void setJobSkills(List<Skills> jobSkills) {
		this.jobSkills = jobSkills;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	@Override
	public String toString() {
		return "Jobseeker [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", jobSkills="
				+ jobSkills + ", resume=" + resume + "]";
	}
}
