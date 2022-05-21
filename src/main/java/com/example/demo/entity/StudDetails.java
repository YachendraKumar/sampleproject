package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudDetails extends CommonFields {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studId;

    private String firstName;

    private String lastName;


    private String emailId;

    private String guardianName;

    private String guardianEmail;

    private String guardianMobile;
}