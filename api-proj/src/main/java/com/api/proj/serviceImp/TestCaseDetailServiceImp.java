package com.api.proj.serviceImp;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.proj.entity.TestCaseDetail;
import com.api.proj.module.TestCaseDetailDTO;
import com.api.proj.repo.TestCaseDetailRepo;
import com.api.proj.service.ClassificationService;
import com.api.proj.service.ClientService;
import com.api.proj.service.ProjectService;
import com.api.proj.service.TestCaseDetailService;
import com.api.proj.utils.ObjectMapperUtils;

@Service
public class TestCaseDetailServiceImp implements TestCaseDetailService {

	@Autowired
	TestCaseDetailRepo testCaseDetailRepo;

	@Autowired
	ClientService clientService;

	@Autowired
	ProjectService projectService;

	@Autowired
	ClassificationService classificationService;

	@Override
	public TestCaseDetail createTestCaseDetail(TestCaseDetailDTO testCaseDetailDTO) {

		TestCaseDetail request = ObjectMapperUtils.map(testCaseDetailDTO, TestCaseDetail.class);
		request.setClient(clientService.getClientByID(testCaseDetailDTO.getClient()));
		request.setProject(projectService.getProjectByID(testCaseDetailDTO.getProject()));
		request.setBuisnessArea(classificationService.getClassificationByID(testCaseDetailDTO.getBuisnessArea()));
		request.setModule(classificationService.getClassificationByID(testCaseDetailDTO.getModule()));
		request.setApplication(classificationService.getClassificationByID(testCaseDetailDTO.getApplication()));
		request.setCreatedOn(LocalDateTime.now());
		TestCaseDetail response = ObjectMapperUtils.map(testCaseDetailRepo.save(request), TestCaseDetail.class);
		return response;
	}

	@Override
	public TestCaseDetailDTO getTestCaseDetailByID(long id) {
		return null;
	}

	@Override
	public List<TestCaseDetailDTO> getAllTestCaseDetail() {
		return null;
	}

}
