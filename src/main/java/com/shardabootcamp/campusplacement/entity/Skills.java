package com.shardabootcamp.campusplacement.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name="skills")
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="skid")
	private Long id;
	private String name;
	@ManyToMany(mappedBy = "jobSkills")
	Set<Jobseeker> jobSeeker;
	@ManyToMany(mappedBy = "empSkills")
	Set<Employeer> employeer;
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
	public Set<Jobseeker> getJobSeeker() {
		return jobSeeker;
	}
	public void setJobSeeker(Set<Jobseeker> jobSeeker) {
		this.jobSeeker = jobSeeker;
	}
	public Set<Employeer> getEmployeer() {
		return employeer;
	}
	public void setEmployeer(Set<Employeer> employeer) {
		this.employeer = employeer;
	}
	public Skills(Long id, String name, Set<Jobseeker> jobSeeker, Set<Employeer> employeer) {
		super();
		this.id = id;
		this.name = name;
		this.jobSeeker = jobSeeker;
		this.employeer = employeer;
	}
	public Skills() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", jobSeeker=" + jobSeeker + ", employeer=" + employeer + "]";
	}
}
