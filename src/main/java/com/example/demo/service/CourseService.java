package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Course;

public interface CourseService {

	Object saveCourseWithTeacher(Course course);

	List<Course> fetchCourseWithTeacher(Course course);

	Object saveCourseAndStudentWithTeacher(Course course);

}
