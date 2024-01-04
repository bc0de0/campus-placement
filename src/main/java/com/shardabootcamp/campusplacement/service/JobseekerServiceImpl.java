package com.shardabootcamp.campusplacement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shardabootcamp.campusplacement.entity.Jobseeker;
import com.shardabootcamp.campusplacement.repository.JobseekerRepo;

@Service
public class JobseekerServiceImpl implements JobseekerService {

	@Autowired
	JobseekerRepo jobseekerRepo;
	@Override
	public List<Jobseeker> getAllJobseeker() {
		// TODO Auto-generated method stub
		return jobseekerRepo.findAll();
	}

}
