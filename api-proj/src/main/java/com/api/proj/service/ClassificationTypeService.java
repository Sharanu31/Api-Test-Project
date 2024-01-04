package com.api.proj.service;

import java.util.List;

import com.api.proj.entity.ClassificationType;

public interface ClassificationTypeService {
	ClassificationType createClassificationType(ClassificationType classificationType);

	List<ClassificationType> getAllClassificationType();

	ClassificationType getClassificationTypeByID(Long id);
}
