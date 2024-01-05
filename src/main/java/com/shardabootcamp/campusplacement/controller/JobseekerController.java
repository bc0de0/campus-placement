package com.shardabootcamp.campusplacement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shardabootcamp.campusplacement.entity.Jobseeker;
import com.shardabootcamp.campusplacement.service.JobseekerService;

@RestController
public class JobseekerController {
	
	@Autowired
	JobseekerService jobseekerService;
	
	@GetMapping("/seekers")
	public ResponseEntity<List<Jobseeker>> getAllJobseeker(){
		List<Jobseeker> jobseekers = jobseekerService.getAllJobseeker();
		return ResponseEntity.ok(jobseekers);
	}
	
	@GetMapping("/seekers/{id}")
	public ResponseEntity<Jobseeker> getJobseekerById(@PathVariable Long id){
		Jobseeker jobseeker = jobseekerService.getJobseekerById(id);
		if(jobseeker != null) {
			return ResponseEntity.ok(jobseeker);
		}
		else {
			return ResponseEntity.notFound().build();
		}
		 
	}
	
	@PostMapping("/seekers")
	public ResponseEntity<Jobseeker> 
	registerJobseeker(@RequestBody Jobseeker jobseeker){
		Jobseeker createdJobseeker = jobseekerService.registerJobseeker(jobseeker);
		return new ResponseEntity<>(createdJobseeker, HttpStatus.CREATED);
	}

}
