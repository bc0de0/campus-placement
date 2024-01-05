package com.shardabootcamp.campusplacement.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "jobseeker")
public class Jobseeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@ManyToMany(cascade=jakarta.persistence.CascadeType.ALL)
	@JoinTable(
	  name = "job-skills", 
	  joinColumns = @JoinColumn(name="studentid"), 
	  inverseJoinColumns = @JoinColumn(name = "skillid"))
	private Set<Skills> jobSkills = new HashSet<Skills>();
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="details_id", referencedColumnName="id")
	private JobseekerDetails details;
	public Jobseeker(Long id, String name, Set<Skills> jobSkills) {
		super();
		this.id = id;
		this.name = name;
		this.jobSkills = jobSkills;
	}
	public Jobseeker() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Jobseeker [id=" + id + ", name=" + name + ", jobSkills=" + jobSkills + "]";
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
	public Set<Skills> getJobSkills() {
		return jobSkills;
	}
	public void setJobSkills(Set<Skills> jobSkills) {
		this.jobSkills = jobSkills;
	}
	
}
