package com.api.proj.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.proj.entity.ClassificationType;
import com.api.proj.repo.ClassificationTypeRepo;
import com.api.proj.service.ClassificationTypeService;


@Service
public class ClassificationTypeServiceImp implements ClassificationTypeService {

	@Autowired
	private ClassificationTypeRepo classificationTypeRepository;

	@Override
	public ClassificationType createClassificationType(ClassificationType classificationType) {
		return classificationTypeRepository.save(classificationType);
	}

	@Override
	public List<ClassificationType> getAllClassificationType() {

		return classificationTypeRepository.findAll();
	}

	@Override
	public ClassificationType getClassificationTypeByID(Long id) {
		return classificationTypeRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("ClassificationTypw with id +" + id + " not found"));
	}

}
