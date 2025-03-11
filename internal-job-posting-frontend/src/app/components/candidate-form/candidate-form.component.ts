import { Component } from '@angular/core';
import { CandidateService } from '../../services/candidate.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-candidate-form',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './candidate-form.component.html',
  styleUrls: ['./candidate-form.component.css']
})
export class CandidateFormComponent {
  candidate = { name: '', email: '', resumeUrl: '' };
  constructor(private candidateService: CandidateService) {}

  registerCandidate() {
    this.candidateService.registerCandidate(this.candidate).subscribe(() => {
      alert('Candidate registered successfully!');
    });
  }
}
