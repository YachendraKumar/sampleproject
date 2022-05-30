package com.example.demo.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name ="tbl_student")
public class Student extends CommonFields {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(
			name="student_seqence",
			sequenceName = "student_seqence",
			allocationSize = 1
			)
    @GeneratedValue(
    		strategy = GenerationType.SEQUENCE,
    			generator ="student_seqence"
    								)
    private Long studId;

    private String firstName;

    private String lastName;

    @Email
    private String emailId;

    @Embedded
    private Guardian guardian;

    
    
    
	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	public Long getStudId() {
		return studId;
	}

	public void setStudId(Long studId) {
		this.studId = studId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}