package com.api.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.proj.entity.TestCaseDetail;

public interface TestCaseDetailRepo extends JpaRepository<TestCaseDetail, Long> {

}
