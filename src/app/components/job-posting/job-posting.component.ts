import { Component } from '@angular/core';
import { JobService } from '../../services/job.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-job-form',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './job-posting.component.html',
  styleUrls: ['./job-posting.component.css']
})
export class JobFormComponent {
  job = { title: '', description: '', department: '' };
  constructor(private jobService: JobService) {}

  postJob() {
    this.jobService.postJob(this.job).subscribe(() => {
      alert('Job posted successfully!');
    });
  }
}
