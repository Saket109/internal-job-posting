package com.example.internal_job_posting.services;

import com.example.internal_job_posting.models.Job;
import com.example.internal_job_posting.repositories.JobRepository;
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
public class JobServiceTest {

    @Mock
    private JobRepository jobRepository;

    @InjectMocks
    private JobService jobService;

    @Test
    void testGetAllJobs() {
        Job job1 = new Job(1L, "Software Engineer", "Develop applications", "IT");
        Job job2 = new Job(2L, "Data Analyst", "Analyze data", "Analytics");

        when(jobRepository.findAll()).thenReturn(Arrays.asList(job1, job2));

        List<Job> jobs = jobService.getAllJobs();
        assertEquals(2, jobs.size());
    }
}
