package com.example.internalJobPosting.repositories;

import com.example.internalJobPosting.models.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPosting, Long> {
}
