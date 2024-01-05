package com.shardabootcamp.campusplacement.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class JobseekerDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String fName;
	private String lName;
	private String address;
	private String collage;
	private String linkedin;
	private String userName;
	private String password;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@OneToOne(mappedBy="details")
	private Jobseeker seeker;

	public JobseekerDetails(String fName, String lName, String address, String collage, String linkedin,
			String userName, String password, Date dateOfBirth, Jobseeker seeker) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.collage = collage;
		this.linkedin = linkedin;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.seeker = seeker;
	}

	public JobseekerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Jobseeker getSeeker() {
		return seeker;
	}

	public void setSeeker(Jobseeker seeker) {
		this.seeker = seeker;
	}

	@Override
	public String toString() {
		return "JobseekerDetails [id=" + id + ", fName=" + fName + ", lName=" + lName + ", address=" + address
				+ ", collage=" + collage + ", linkedin=" + linkedin + ", userName=" + userName + ", password="
				+ password + ", dateOfBirth=" + dateOfBirth + ", seeker=" + seeker + "]";
	}

}
