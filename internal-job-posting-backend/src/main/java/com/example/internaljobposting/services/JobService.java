package com.example.internaljobposting.services;

import com.example.internalJobPosting.models.JobPosting;
import com.example.internalJobPosting.repositories.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<JobPosting> getAllJobs() {
        return jobRepository.findAll();
    }

    public JobPosting createJob(JobPosting jobPosting) {
        return jobRepository.save(jobPosting);
    }
}
