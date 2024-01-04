package com.api.proj.module;

import com.api.proj.entity.ClassificationType;

import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ClassificationDTO {

	private Long id;
	private String name;
	private String decription;
	private Long type;
}
