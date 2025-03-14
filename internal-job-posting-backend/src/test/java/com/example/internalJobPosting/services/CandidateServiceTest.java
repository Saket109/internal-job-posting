package com.example.internaljobposting.services;

import com.example.internaljobposting.models.Candidate;
import com.example.internaljobposting.repositories.CandidateRepository;
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
public class CandidateServiceTest {

    @Mock
    private CandidateRepository candidateRepository;

    @InjectMocks
    private CandidateService candidateService;

    @Test
    void testGetAllCandidates() {
        Candidate c1 = new Candidate(1L, "Alice", "alice@example.com", "Other details");
        Candidate c2 = new Candidate(2L, "Bob", "bob@example.com", "Other details");

        when(candidateRepository.findAll()).thenReturn(Arrays.asList(c1, c2));

        List<Candidate> candidates = candidateService.getAllCandidates();
        assertEquals(2, candidates.size());
    }
}
