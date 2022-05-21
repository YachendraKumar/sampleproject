package com.example.demo.repository;

import com.example.demo.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface SchoolRepo extends JpaRepository<School,Long> {
}
