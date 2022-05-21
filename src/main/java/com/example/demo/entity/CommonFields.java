package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Date;

public abstract class CommonFields implements Serializable {

    @JsonFormat(pattern="dd-MM-yyyy")
    @CreatedDate
    @Column(name = "created_on",insertable = true,nullable = false,updatable = true)
    private Date createdOn = new Date();

    @JsonFormat(pattern="dd-MM-yyyy hh:mm")
    @LastModifiedDate
    @Column(name = "created_on",insertable = true,nullable = false,updatable = true)
    private Date updatedOn = new Date();

}
