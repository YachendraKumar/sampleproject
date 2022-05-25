package com.example.demo.service.serviceimpl;

import com.example.demo.entity.School;
import com.example.demo.repository.SchoolRepo;
import com.example.demo.service.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolRepo schoolRepo;

    @Override
    public School saveStudent(School school) {
        return schoolRepo.save(school);
    }

    @Override
    public List<School> fetchStudentList() {
        return schoolRepo.findAll();
    }

    @Override
    public School fetchStudentById(Long studentId) {
        return schoolRepo.findById(studentId).get();
    }

    @Override
    public void deleteStudentById(Long studentId) {
        schoolRepo.deleteById(studentId);
    }

    @Override
    public School updateStudentById(Long studentId, School school) {
        School schl = schoolRepo.findById(studentId).get();
        if(studentId != null){
            schl.setStudentEmail(school.getStudentEmail());
            schl.setStudentName(school.getStudentName());
            schl.setSection(school.getSection());
            schl.setStudentFee(school.getStudentFee());
            schl.setStudentVanFee(school.getStudentVanFee());
        }
       return schoolRepo.save(schl);
    }

    @Override
    public School patchById(Long studentId, School school) {
        School sc = schoolRepo.findById(studentId).get();
        if(studentId != null){
            sc.setsDoj(school.getsDoj());
        }
        return schoolRepo.save(sc);
    }

	@Override
	public List<School> fetchStudentListWithSorting(String studentId) {
		return schoolRepo.findAll(Sort.by(studentId));
	}

	@Override
	public Page<School> fetchStudentListWithPagination(int pageNumber, int pageSize) {
		Page<School> page = schoolRepo.findAll(PageRequest.of(pageNumber, pageSize));
		return page;
	}

}
