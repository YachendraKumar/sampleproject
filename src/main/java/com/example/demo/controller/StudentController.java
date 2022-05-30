package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.util.CommonResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public CommonResponse saveStudent(@RequestBody Student student) {
		return new CommonResponse(1, "true",studentService.saveStudent(student), true, true);
	}
	
	@PatchMapping("/patch/{id}")
	public CommonResponse updateStudent(@PathVariable("id") Long studId, @RequestBody Student student) {
		return new CommonResponse(1, "Updated Sucessfully",studentService.updateStudent(studId,student), true, true);
	}
	
	@GetMapping("/list/page/{studentId}")
	public CommonResponse fetchListOfStudentsData(@PathVariable String studId,@RequestParam(required = false) int pageNumber,@RequestParam(required = false) int pageSize) {
		Page<Student> students = studentService.fetchListOfStudentsData(studId,pageNumber,pageSize);
		return new CommonResponse(students.getSize(),"true", students, true, true);
	}
	
	@GetMapping("/list")
	public CommonResponse fetchList() {
		List<Student> students = studentService.fetchList();
		return new CommonResponse(students.size(),"true", students, true, true);
	}

	
	@DeleteMapping("/list/delete/{id}")
	public CommonResponse deleteByStudentId(@PathVariable("id") Long studId) {
		return new CommonResponse(1,"Deleted Sucessfully", studentService.deleteByStudentId(studId), true, true);
	}
	
	@DeleteMapping("/list/delete/all")
	public CommonResponse deleteAllStudents() {
		return new CommonResponse(1,"true", studentService.deleteAllStudents(), true, true);
	}

}
