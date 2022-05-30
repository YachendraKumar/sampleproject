package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.example.demo.entity.Student;

public interface StudentService  {

	Student saveStudent(Student student);

	Object updateStudent(Long studId, Student student);

	Page<Student> fetchListOfStudentsData(String studId, int pageNumber, int pageSize);

	List<Student> fetchList();

	public Object deleteByStudentId(Long studId);

	Object deleteAllStudents();


}
