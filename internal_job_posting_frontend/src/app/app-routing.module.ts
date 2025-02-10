import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { JobListComponent } from './components/job-list/job-list.component';
import { JobFormComponent } from './components/job-form/job-form.component';
import { CandidateListComponent } from './components/candidate-list/candidate-list.component';
import { CandidateFormComponent } from './components/candidate-form/candidate-form.component';

const routes: Routes = [
  { path: 'jobs', component: JobListComponent },
  { path: 'add-job', component: JobFormComponent },
  { path: 'candidates', component: CandidateListComponent },
  { path: 'add-candidate', component: CandidateFormComponent },
  { path: '', redirectTo: '/jobs', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
