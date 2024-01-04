package com.api.proj.service;

import java.util.List;

import com.api.proj.entity.Project;

public interface ProjectService {


	List<Project> getAllProject();

	Project createClient(Project project);

	Project getProjectByID(long id);
}
