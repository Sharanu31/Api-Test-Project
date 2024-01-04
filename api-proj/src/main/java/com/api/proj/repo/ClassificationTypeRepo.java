package com.api.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.api.proj.entity.ClassificationType;


public interface ClassificationTypeRepo extends JpaRepository<ClassificationType, Long>{

}
