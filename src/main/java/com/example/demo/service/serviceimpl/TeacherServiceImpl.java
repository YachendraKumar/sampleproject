package com.example.demo.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repository.TeacherRepo;
import com.example.demo.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepo teacherRepo;
	
	@Override
	public Object saveTeacherData(Teacher teacher) {
		return teacherRepo.save(teacher);
	}

	@Override
	public List<Teacher> findByTeacher(Teacher teacher) {
		return teacherRepo.findAll();
	}



}
