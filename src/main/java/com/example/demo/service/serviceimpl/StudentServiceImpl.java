package com.example.demo.service.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepo;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}


	@Override
	public Object updateStudent(Long studId, Student student) {
		Student studentz = studentRepo.findById(studId).get();
		   if(studId != null){
			   studentz.setEmailId(student.getEmailId());
	        }
	        return studentRepo.save(studentz);
	    }


	@Override
	public Page<Student> fetchListOfStudentsData(String studId, int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize,Sort.by(studId));
		 Page<Student> school = studentRepo.findAll(pageable);
		return school;
	}


	@Override
	public List<Student> fetchList() {
		return  studentRepo.findAll();
	}


	@Override
	public Object deleteByStudentId(Long studId) {
		 studentRepo.deleteById(studId);
		return studId;
	}


	@Override
	public Object deleteAllStudents() {
		 studentRepo.deleteAll();
		 return "Sucessfull on Deletion of All Students";
	}

}
