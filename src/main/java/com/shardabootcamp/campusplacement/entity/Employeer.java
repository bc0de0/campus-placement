package com.shardabootcamp.campusplacement.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity(name="employeer")
public class Employeer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String description;
	
	@ManyToMany
	@JoinTable(
	  name = "emp-skills", 
	  joinColumns = @JoinColumn(name="empid"), 
	  inverseJoinColumns = @JoinColumn(name = "skillid"))
	private Set<Skills> empSkills;

	public Employeer(Long id, String name, String email, String phone, String description, Set<Skills> empSkills) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.description = description;
		this.empSkills = empSkills;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Skills> getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(Set<Skills> empSkills) {
		this.empSkills = empSkills;
	}

	public Employeer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employeer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", description="
				+ description + ", empSkills=" + empSkills + "]";
	}
	
}
