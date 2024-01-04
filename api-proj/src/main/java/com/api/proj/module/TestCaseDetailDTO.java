package com.api.proj.module;

import java.time.LocalDateTime;

import com.api.proj.entity.Client;

import lombok.Data;

@Data
public class TestCaseDetailDTO {

	private Long id;
	private Long client;
	private Long project;
	private String name;
	private String summary;
	private Long buisnessArea;
	private Long module;
	private Long application;
	private String description;
	private String preRequisites;
	private String keyTestData;
	private String uiCases;
	private String roles;
	private String financial;
	private String layer;
	private String mode;
	private LocalDateTime createdOn;
}
