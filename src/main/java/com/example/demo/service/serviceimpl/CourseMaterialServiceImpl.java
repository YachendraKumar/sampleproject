package com.example.demo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CourseMaterial;
import com.example.demo.repository.CourseMaterialRepo;
import com.example.demo.service.CourseMaterialService;

@Service
public class CourseMaterialServiceImpl implements CourseMaterialService {

	@Autowired
	private CourseMaterialRepo courseMaterialRepo;
	
	@Override
	public Object saveAsCourseMaterial(CourseMaterial courseMaterial) {
		return courseMaterialRepo.save(courseMaterial);
	}

	@Override
	public Page<CourseMaterial> fetchByCourseMaterial(String courseMaterialId, int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("courseId"));
		Page<CourseMaterial> cores = courseMaterialRepo.findAll(pageable);
		return cores;
	}

	@Override
	public List<CourseMaterial> fetchByCourseMaterial() {
		return courseMaterialRepo.findAll();
	}

}
