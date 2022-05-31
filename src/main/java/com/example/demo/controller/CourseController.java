package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CommonFields;
import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import com.example.demo.util.CommonResponse;

@RestController
@RequestMapping("/course/teacher")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping("/save")
	public CommonResponse saveCourseWithTeacher(@RequestBody Course course) {
		return new CommonResponse(1,"true",courseService.saveCourseWithTeacher(course),true,true);
	}
	
	//need to be commented on teacher class for course then only fetching will happen else throws an exception
	@GetMapping("/list")
	public CommonResponse fetchCourseWithTeacher(@RequestBody Course course) {
		List<Course> cours = courseService.fetchCourseWithTeacher(course);
		return new CommonResponse(cours.size(),"true",cours,true,true);
	}
	
}
