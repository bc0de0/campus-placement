package com.shardabootcamp.campusplacement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shardabootcamp.campusplacement.entity.Employeer;

public interface EmployeerRepo extends JpaRepository<Employeer, Long>{

}
