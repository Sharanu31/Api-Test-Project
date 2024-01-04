package com.api.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.proj.entity.ClassificationType;
import com.api.proj.service.ClassificationTypeService;

@RestController
@RequestMapping("classificationType")
public class ClassificationTypeController {

	@Autowired
	ClassificationTypeService classificationTypeService;

	@GetMapping
	private List<ClassificationType> getAllClassificationType() {
		return classificationTypeService.getAllClassificationType();
	}

	@PostMapping
	private ClassificationType createClassificationType(@RequestBody ClassificationType classificationType) {
		return classificationTypeService.createClassificationType(classificationType);
	}

	@GetMapping("/{id}")
	private ClassificationType getAllClassificationTypeByID(@PathVariable long id) {
		return classificationTypeService.getClassificationTypeByID(id);
	}
}
