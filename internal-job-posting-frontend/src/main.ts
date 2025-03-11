import { bootstrapApplication } from '@angular/platform-browser';
import { AppComponent } from './app/app.component';
import { provideHttpClient } from '@angular/common/http'; 
import { provideRouter } from '@angular/router';
import { routes } from './app/app-routing.module'; // ✅ Import your routes

bootstrapApplication(AppComponent, {
    providers: [
        provideHttpClient(), // ✅ Keep HTTP Client
        provideRouter(routes) // ✅ Add routing support
    ]
})
    .catch(err => console.error(err));
