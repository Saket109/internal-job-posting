package com.example.internalJobPosting.controllers;

import com.example.internalJobPosting.models.Candidate;
import com.example.internalJobPosting.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/candidates")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @PostMapping
    public Candidate registerCandidate(@RequestBody Candidate candidate) {
        return candidateService.registerCandidate(candidate);
    }
}
