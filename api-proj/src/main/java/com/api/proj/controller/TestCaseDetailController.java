package com.api.proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.proj.entity.Client;
import com.api.proj.entity.TestCaseDetail;
import com.api.proj.module.TestCaseDetailDTO;
import com.api.proj.service.TestCaseDetailService;

@RestController
@RequestMapping("/testCaseDetail")
public class TestCaseDetailController {

	@Autowired
	TestCaseDetailService testCaseDetailService;

	@GetMapping
	private List<?> getAllTestCaseDetail() {
		return testCaseDetailService.getAllTestCaseDetail();
	}

	@PostMapping
	private TestCaseDetail createClient(@RequestBody TestCaseDetailDTO testCaseDetailDTO) {
		return testCaseDetailService.createTestCaseDetail(testCaseDetailDTO);
	}

	@GetMapping("/{id}")
	private TestCaseDetailDTO getAllTestCaseDetailDTOID(@PathVariable long id) {
		return testCaseDetailService.getTestCaseDetailByID(id);
	}

}
