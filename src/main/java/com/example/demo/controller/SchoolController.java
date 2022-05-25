package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.School;
import com.example.demo.service.SchoolService;
import com.example.demo.util.CommonResponse;


@RestController
@Controller
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/school")
    public School saveStudent(@RequestBody School school){
        return schoolService.saveStudent(school);
    }

    @GetMapping("/school/list")
    public List<School> fetchStudentList(){
        return schoolService.fetchStudentList();
    }

    @GetMapping("/school/{id}")
    public School fetchStudentById(@PathVariable("id") Long studentId){
        return schoolService.fetchStudentById(studentId);
    }

    @DeleteMapping("/school/delete/{id}")
    public String deleteStudentById(@PathVariable("id") Long studentId){
        schoolService.deleteStudentById(studentId);
        return "Deleted ID Sucessfully";
    }

    @PutMapping("/school/update/{id}")
    public School updateStudentById(@PathVariable("id") Long studentId,@RequestBody School school) {
        return schoolService.updateStudentById(studentId, school);
    }

    @PatchMapping("/school/patch/{id}")
    public School patchById(@PathVariable("id") Long studentId,@RequestBody School school){
        return schoolService.patchById(studentId,school);
    }
    
    @GetMapping("/school/list/{studentId}")
    public CommonResponse fetchStudentListWithSorting(@PathVariable String studentId){
    	 List<School> school = new ArrayList<>();
    	 school = schoolService.fetchStudentListWithSorting(studentId);
    	 return new CommonResponse(school.size(), "true", school, true, true);
    }
    
    @GetMapping("/school/list/{pageNumber}/{pageSize}")
    public CommonResponse fetchStudentListWithPagination(@PathVariable int pageNumber,@PathVariable int pageSize){
    	 Page<School> school = schoolService.fetchStudentListWithPagination(pageNumber,pageSize);
    	 return new CommonResponse(school.getSize(), "true", school, true, true);
    }
}
