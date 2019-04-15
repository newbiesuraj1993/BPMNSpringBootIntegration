package com.infy.activiti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.activiti.entity.Applicant;

@Repository
public interface ApplicantRepositiory extends JpaRepository<Applicant, Long> {

}
