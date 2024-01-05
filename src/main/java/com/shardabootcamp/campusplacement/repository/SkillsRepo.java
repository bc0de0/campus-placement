package com.shardabootcamp.campusplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shardabootcamp.campusplacement.entity.Skills;

public interface SkillsRepo extends JpaRepository<Skills, Long>{

	@Query("SELECT name FROM skills WHERE name=:skill")
	Skills findByName(Skills skill);

}
