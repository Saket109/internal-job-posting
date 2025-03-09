import { Component } from '@angular/core';
import { JobListComponent } from './components/job-list/job-list.component';
import { CandidateListComponent } from './components/candidate-list/candidate-list.component';
import { JobFormComponent } from "./components/job-posting/job-posting.component";
import { CandidateFormComponent } from "./components/candidate-form/candidate-form.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [JobListComponent, CandidateListComponent, JobFormComponent, CandidateFormComponent],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello, job-portal';
}
