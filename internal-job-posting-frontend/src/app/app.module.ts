import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { JobListComponent } from './components/job-list/job-list.component';
import { CandidateListComponent } from './components/candidate-list/candidate-list.component';
import { JobFormComponent } from './components/job-form/job-form.component';
import { CandidateFormComponent } from './components/candidate-form/candidate-form.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppComponent,        // ✅ Import standalone components here
    JobListComponent,
    CandidateListComponent,
    JobFormComponent,
    CandidateFormComponent
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
