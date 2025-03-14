package com.example.internaljobposting.repositories;

import com.example.internaljobposting.models.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobPosting, Long> {
}
