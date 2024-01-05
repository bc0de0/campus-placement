package com.shardabootcamp.campusplacement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shardabootcamp.campusplacement.entity.Jobseeker;
import com.shardabootcamp.campusplacement.entity.Skills;
import com.shardabootcamp.campusplacement.repository.JobseekerRepo;
import com.shardabootcamp.campusplacement.repository.SkillsRepo;

@Service
public class JobseekerServiceImpl implements JobseekerService {

	@Autowired
	JobseekerRepo jobseekerRepo;
	@Autowired
	SkillsRepo skillRepo;
	
	@Override
	public List<Jobseeker> getAllJobseeker() {
		// TODO Auto-generated method stub
		return jobseekerRepo.findAll();
	}
	@Override
	public Jobseeker getJobseekerById(Long id) {
		// TODO Auto-generated method stub
		Jobseeker jobseeker = jobseekerRepo.findById(id).orElse(null);
		return jobseeker;
	}
	@Override
	public Jobseeker registerJobseeker(Jobseeker jobseeker) {
		// TODO Auto-generated method stub
		for(Skills skill: jobseeker.getJobSkills()) {
				skillRepo.save(skill);
		}
		return jobseekerRepo.save(jobseeker);
	}

}
	