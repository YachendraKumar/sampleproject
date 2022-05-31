package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Teacher;

public interface TeacherService {

	Object saveTeacherData(Teacher teacher);

	List<Teacher> findByTeacher(Teacher teacher);

}
