package com.api.proj.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TestCaseDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Client client;

	@ManyToOne
	private Project project;

	private String name;

	private String summary;

	@ManyToOne
	private Classification buisnessArea;

	@ManyToOne
	private Classification module;

	@ManyToOne
	private Classification application;

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
