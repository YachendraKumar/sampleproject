package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Course extends CommonFields{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@SequenceGenerator
	( 	name ="course_sequence",
		sequenceName ="course_sequence",
		allocationSize = 1)
	@GeneratedValue
	(strategy = GenerationType.SEQUENCE,
	generator ="course_sequence" )
	private Long courseId;
	
	private String title;
	
	private Integer credit;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="teacher_id",referencedColumnName = "teacherId")
	private Teacher teacher;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable
	(
		name ="student_course_map",
		joinColumns = @JoinColumn(name ="course_id", referencedColumnName = "courseId") ,
		inverseJoinColumns = @JoinColumn(name="stud_id",referencedColumnName = "studId")
	)
	private List<Student> students;
	
	
   //Getters and Setters
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getCredit() {
		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

}
