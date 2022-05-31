package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entity.CourseMaterial;

public interface CourseMaterialService {

	Object saveAsCourseMaterial(CourseMaterial courseMaterial);

	Page<CourseMaterial> fetchByCourseMaterial(String courseMaterialId, int pageNumber, int pageSize);

	List<CourseMaterial> fetchByCourseMaterial();

}
