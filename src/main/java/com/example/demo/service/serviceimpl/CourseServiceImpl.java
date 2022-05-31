package com.example.demo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepo;
import com.example.demo.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	private CourseRepo courseRepo;
	
	@Override
	public Object saveCourseWithTeacher(Course course) {
		return courseRepo.save(course);
	}

	@Override
	public List<Course> fetchCourseWithTeacher(Course course) {
		return courseRepo.findAll();
	}

}
