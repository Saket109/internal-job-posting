package com.example.internal_job_posting.services;

import com.example.internal_job_posting.models.Candidate;
import com.example.internal_job_posting.repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public List<Candidate> getAllCandidates() {
        return candidateRepository.findAll();
    }

    public Candidate registerCandidate(Candidate candidate) {
        return candidateRepository.save(candidate);
    }
}
