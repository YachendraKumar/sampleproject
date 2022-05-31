package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;
import com.example.demo.util.CommonResponse;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/save")
	public CommonResponse saveTeacherData(@RequestBody Teacher teacher) {
		return new CommonResponse(1,"true",teacherService.saveTeacherData(teacher),true,true);
	}

	
	@GetMapping("/list")
	public CommonResponse findByTeacher(@RequestBody Teacher teacher) {
		List<Teacher> teach = teacherService.findByTeacher(teacher);
		return new CommonResponse(teach.size(),"true",teach,true,true);
	}
}
