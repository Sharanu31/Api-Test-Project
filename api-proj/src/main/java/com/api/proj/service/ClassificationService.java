package com.api.proj.service;

import java.util.List;

import com.api.proj.entity.Classification;
import com.api.proj.module.ClassificationDTO;

public interface ClassificationService {

	Classification createClassification(ClassificationDTO classification);

	List<Classification> getAllClassification();

	Classification getClassificationByID(Long id);
}
