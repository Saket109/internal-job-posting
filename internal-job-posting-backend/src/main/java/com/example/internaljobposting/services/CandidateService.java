package com.example.internalJobPosting.services;

import com.example.internalJobPosting.models.Candidate;
import com.example.internalJobPosting.repositories.CandidateRepository;
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
