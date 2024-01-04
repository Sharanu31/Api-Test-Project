package com.api.proj.service;

import java.util.List;

import com.api.proj.entity.TestCaseDetail;
import com.api.proj.module.TestCaseDetailDTO;

public interface TestCaseDetailService {

	TestCaseDetail createTestCaseDetail(TestCaseDetailDTO testCaseDetailDTO);

	TestCaseDetailDTO getTestCaseDetailByID(long id);

	List<TestCaseDetailDTO> getAllTestCaseDetail();
}
