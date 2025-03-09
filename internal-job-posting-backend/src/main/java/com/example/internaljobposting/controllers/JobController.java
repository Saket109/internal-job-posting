package com.example.internalJobPosting.controllers;

import com.example.internalJobPosting.models.JobPosting;
import com.example.internalJobPosting.services.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping
    public List<JobPosting> getAllJobs() {
        return jobService.getAllJobs();
    }

    @PostMapping
    public JobPosting createJob(@RequestBody JobPosting jobPosting) {
        return jobService.createJob(jobPosting);
    }
}
