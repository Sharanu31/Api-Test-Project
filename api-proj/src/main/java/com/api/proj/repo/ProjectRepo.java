package com.api.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.proj.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{

}
