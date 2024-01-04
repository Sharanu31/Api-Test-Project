package com.api.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.proj.entity.Classification;
import com.api.proj.entity.ClassificationType;
import com.api.proj.module.ClassificationDTO;
import com.api.proj.service.ClassificationService;

@RestController
@RequestMapping("classification")
public class ClassificationController {

	@Autowired
	ClassificationService classificationService;

	@GetMapping
	private List<Classification> getAllClassification() {
		return classificationService.getAllClassification();
	}

	@PostMapping
	private Classification createClassification(@RequestBody ClassificationDTO classificationDTO) {
		return classificationService.createClassification(classificationDTO);
	}
	
	@GetMapping("/{id}")
	private Classification getAllClassificationByID(@PathVariable long id) {
		return classificationService.getClassificationByID(id);
	}


}
