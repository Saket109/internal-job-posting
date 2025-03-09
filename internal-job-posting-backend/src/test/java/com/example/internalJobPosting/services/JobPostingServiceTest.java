package com.example.internaljobposting.services;

import com.example.internalJobPosting.models.JobPosting;
import com.example.internalJobPosting.repositories.JobRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JobPostingServiceTest {

    @Mock
    private JobRepository jobRepository;

    @InjectMocks
    private JobService jobService;

    @Test
    void testGetAllJobs() {
        JobPosting jobPosting1 = new JobPosting(1L, "Software Engineer", "Develop applications", "IT");
        JobPosting jobPosting2 = new JobPosting(2L, "Data Analyst", "Analyze data", "Analytics");

        when(jobRepository.findAll()).thenReturn(Arrays.asList(jobPosting1, jobPosting2));

        List<JobPosting> jobPostings = jobService.getAllJobs();
        assertEquals(2, jobPostings.size());
    }

    @Test
    void testCreateJob() {
        JobPosting newJob = new JobPosting(3L, "Product Manager", "Manage product lifecycle", "Product");

        when(jobRepository.save(newJob)).thenReturn(newJob);

        JobPosting savedJob = jobService.createJob(newJob);

        assertEquals(newJob.getId(), savedJob.getId());
        assertEquals(newJob.getTitle(), savedJob.getTitle());
    }

}
