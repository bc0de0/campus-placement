package com.shardabootcamp.campusplacement.service;

import java.util.List;

import com.shardabootcamp.campusplacement.entity.Jobseeker;

public interface JobseekerService {

	List<Jobseeker> getAllJobseeker();

	Jobseeker getJobseekerById(Long id);

	Jobseeker registerJobseeker(Jobseeker jobseeker);

}
