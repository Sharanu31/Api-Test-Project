package com.api.proj.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.proj.entity.Project;
import com.api.proj.repo.ProjectRepo;
import com.api.proj.service.ProjectService;

@Service
public class ProjectServiceImp implements ProjectService {

	@Autowired
	ProjectRepo projectRepo;

	@Override
	public List<Project> getAllProject() {
		return projectRepo.findAll();
	}

	@Override
	public Project createClient(Project project) {
		return projectRepo.save(project);
	}

	@Override
	public Project getProjectByID(long id) {
		return projectRepo.findById(id).orElseThrow();
	}

}
