import { Component } from '@angular/core';
import { JobListComponent } from './components/job-list/job-list.component';
import { CandidateListComponent } from './components/candidate-list/candidate-list.component';
import { JobFormComponent } from "./components/job-form/job-form.component";
import { CandidateFormComponent } from "./components/candidate-form/candidate-form.component";
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [JobListComponent, CandidateListComponent, JobFormComponent, CandidateFormComponent, RouterModule],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Job and Candidate Management';
}
