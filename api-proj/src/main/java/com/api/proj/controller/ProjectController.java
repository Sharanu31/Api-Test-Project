package com.api.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.proj.entity.Project;
import com.api.proj.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService projectService;

	@GetMapping
	public List<Project> getAllProjects() {
		return projectService.getAllProject();
	}

	@PostMapping
	public Project createProject(@RequestBody Project project) {
		return projectService.createClient(project);
	}

	@GetMapping("/{id}")
	public Project projectByID(@PathVariable Long id) {
		return projectService.getProjectByID(id);
	}
}
