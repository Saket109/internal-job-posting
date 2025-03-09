import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module'; 
import { JobListComponent } from './components/job-list/job-list.component';
import { CandidateListComponent } from './components/candidate-list/candidate-list.component';
import { JobFormComponent } from './components/job-posting/job-posting.component';
import { CandidateFormComponent } from './components/candidate-form/candidate-form.component';

@NgModule({
  declarations: [ 
    AppComponent,
    JobListComponent,
    CandidateListComponent,
    JobFormComponent,
    CandidateFormComponent
  ],
  imports: [    
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
