package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {
	
	@Query("select s from Student s  where s.emailId = ?1")
	List<Student> findByEmailAddress(String emailId);

	List<Student> findByFirstNameAndLastName(String firstName, String lastName);

}
