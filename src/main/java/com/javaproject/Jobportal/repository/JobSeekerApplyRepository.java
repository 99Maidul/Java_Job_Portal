package com.javaproject.Jobportal.repository;

import com.javaproject.Jobportal.entity.JobPostActivity;
import com.javaproject.Jobportal.entity.JobSeekerProfile;
import com.javaproject.Jobportal.entity.JobSeekerApply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}