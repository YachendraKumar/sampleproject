package com.example.demo.service;

import com.example.demo.entity.School;

import java.util.List;

public interface SchoolService {

   public School saveStudent(School school);

   public List<School> fetchStudentList();

  public School fetchStudentById(Long studentId);

   public void deleteStudentById(Long studentId);

   public School updateStudentById(Long studentId, School school);

    public School patchById(Long studentId, School school);
}
