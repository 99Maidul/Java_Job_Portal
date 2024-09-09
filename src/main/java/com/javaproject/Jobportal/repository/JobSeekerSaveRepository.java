package com.javaproject.Jobportal.repository;

import com.javaproject.Jobportal.entity.JobPostActivity;
import com.javaproject.Jobportal.entity.JobSeekerProfile;
import com.javaproject.Jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}