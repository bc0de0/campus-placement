package com.shardabootcamp.campusplacement.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity(name="skills")
public class Skills {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@ManyToMany(mappedBy="jobSkills")
	Set<Jobseeker> jobseekers;
	public Skills(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Skills() {
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
	public Set<Jobseeker> getJobseekers() {
		return jobseekers;
	}
	public void setJobseekers(Set<Jobseeker> jobseekers) {
		this.jobseekers = jobseekers;
	}
	@Override
	public String toString() {
		return "Skills [id=" + id + ", name=" + name + ", jobseekers=" + jobseekers + "]";
	}
	
	
}
