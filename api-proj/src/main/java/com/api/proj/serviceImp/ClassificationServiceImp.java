package com.api.proj.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.proj.entity.Classification;
import com.api.proj.entity.TestCaseDetail;
import com.api.proj.module.ClassificationDTO;
import com.api.proj.repo.ClassificationRepo;
import com.api.proj.service.ClassificationService;
import com.api.proj.service.ClassificationTypeService;
import com.api.proj.utils.ObjectMapperUtils;

@Service
public class ClassificationServiceImp implements ClassificationService {

	@Autowired
	private ClassificationRepo classificationRepository;

	@Autowired
	private ClassificationTypeService classificationTypeService;

	@Override
	public Classification createClassification(ClassificationDTO classificationDTO) {
		Classification request = ObjectMapperUtils.map(classificationDTO, Classification.class);

		request.setType(classificationTypeService.getClassificationTypeByID(classificationDTO.getType()));
		Classification response = ObjectMapperUtils.map(classificationRepository.save(request), Classification.class);

		return response;
	}

	@Override
	public List<Classification> getAllClassification() {
		return classificationRepository.findAll();
	}

	@Override
	public Classification getClassificationByID(Long id) {
		return classificationRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
	}
}
