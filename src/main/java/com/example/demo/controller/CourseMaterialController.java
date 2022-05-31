package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CourseMaterial;
import com.example.demo.entity.Student;
import com.example.demo.service.CourseMaterialService;
import com.example.demo.util.CommonResponse;

@RestController
@RequestMapping("/student/course")
public class CourseMaterialController {

	@Autowired
	private CourseMaterialService courseMaterialService;
	
	@PostMapping("/save")
	public CommonResponse saveAsCourseMaterial(@RequestBody CourseMaterial courseMaterial) {
		return new CommonResponse(1, "true",courseMaterialService.saveAsCourseMaterial(courseMaterial), true, true);
	}
	
	@GetMapping("/list/page/{courseMaterialId}")
	public CommonResponse fetchByCourseMaterial(@PathVariable("courseMaterialId") String courseMaterialId,@RequestParam(required = false) int pageNumber,@RequestParam(required = false) int pageSize) {
		Page<CourseMaterial> courseMaterials = courseMaterialService.fetchByCourseMaterial(courseMaterialId,pageNumber,pageSize);
		return new CommonResponse(courseMaterials.getSize(), "true",courseMaterials, true, true);
	}
	
	@GetMapping("/list")
	public CommonResponse fetchByCoursesMaterial() {
		List<CourseMaterial> coursesMaterials = courseMaterialService.fetchByCourseMaterial();
		return new CommonResponse(coursesMaterials.size(), "true",coursesMaterials, true, true);
	}
}
