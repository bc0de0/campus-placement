package com.shardabootcamp.campusplacement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shardabootcamp.campusplacement.entity.Jobseeker;
import com.shardabootcamp.campusplacement.service.JobseekerService;

@RestController
public class JobseekerController {
	
	@Autowired
	JobseekerService jobseekerService;
	
	@GetMapping("/seekers")
	public Optional<List<Jobseeker>> getAllJobseeker(){
		List<Jobseeker> jobseekers = jobseekerService.getAllJobseeker();
		return Optional.ofNullable(jobseekers);
	}

}
