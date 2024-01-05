package com.shardabootcamp.campusplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardabootcamp.campusplacement.entity.Jobseeker;

public interface JobseekerRepo extends JpaRepository<Jobseeker, Long>{
	
	Jobseeker findByName(String name);

}
