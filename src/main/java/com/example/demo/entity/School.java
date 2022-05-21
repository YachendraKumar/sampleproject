package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.DatabindException;

import javax.persistence.*;
import java.util.Date;

@Entity
public class School extends CommonFields{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String studentName;
    private String section;
    private int studentFee;

    private int studentVanFee;
    private String studentEmail;
    @JsonFormat(pattern = "dd-MM-yyyy")
    @Column(name = "date_of_join")
    private Date sDoj;


    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public int getStudentFee() {
        return studentFee;
    }

    public void setStudentFee(int studentFee) {
        this.studentFee = studentFee;
    }

    public int getStudentVanFee() {
        return studentVanFee;
    }

    public void setStudentVanFee(int studentVanFee) {
        this.studentVanFee = studentVanFee;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Date getsDoj() {
        return sDoj;
    }

    public void setsDoj(Date sDoj) {
        this.sDoj = sDoj;
    }
}
