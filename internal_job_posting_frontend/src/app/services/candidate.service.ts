import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CandidateService {
  private apiUrl = 'http://localhost:8080/candidates';

  constructor(private http: HttpClient) {}

  getCandidates(): Observable<any[]> {
    return this.http.get<any[]>(this.apiUrl);
  }

  registerCandidate(candidate: any): Observable<any> {
    return this.http.post<any>(this.apiUrl, candidate);
  }
}
