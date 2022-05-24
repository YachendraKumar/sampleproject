package com.example.demo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class CommonFields implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern="dd-MM-yyyy")
    @CreatedDate
    @Column(name = "created_on",nullable = false, updatable = false)
    private Date createdOn = new Date();

	@JsonFormat(pattern="dd-MM-yyyy")
    @LastModifiedDate
    @Column(name = "updated_on", nullable = false, updatable = true)
    private Date updatedOn = new Date();
    
	@Column(name = "active_status", columnDefinition = "int default 1")
	private Integer activeStatus = 1;

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	

}
