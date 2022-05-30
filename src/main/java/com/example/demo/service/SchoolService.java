package com.example.demo.service;

import com.example.demo.entity.School;

import java.util.List;

import org.springframework.data.domain.Page;

public interface SchoolService {

   public School saveStudent(School school);

   public List<School> fetchStudentList();

  public School fetchStudentById(Long studentId);

   public void deleteStudentById(Long studentId);

   public School updateStudentById(Long studentId, School school);

    public School patchById(Long studentId, School school);


	public List<School> fetchStudentListWithSorting(String studentId);

	public Page<School> fetchStudentListWithPagination(String studentId,int pageNumber, int pageSize);

	public Page<School> fetchStudentListSortAndPagenation(String studentId,int pageNumber, int pageSize);

	public Page<School> fetchStudentsLists(String studentId, int pageNumber, int pageSize);
}
