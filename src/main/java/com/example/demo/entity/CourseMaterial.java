package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class CourseMaterial extends CommonFields{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator
	( name = "course_material_sequence",
	  sequenceName ="course_material_sequence",
	  allocationSize = 1)
	
    @GeneratedValue
    (strategy = GenerationType.SEQUENCE,
     generator ="course_material_sequence")
	private Long courseMaterialId;
	
	private String url;
	
	@OneToOne(cascade = {CascadeType.ALL},
							fetch = FetchType.EAGER)
	@JoinColumn
	(name ="course_id",
	referencedColumnName = "courseId")
	private Course course;

	
	//Getters and Setters
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Long getCourseMaterialId() {
		return courseMaterialId;
	}

	public void setCourseMaterialId(Long courseMaterialId) {
		this.courseMaterialId = courseMaterialId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
