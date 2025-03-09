🏢 Internal Job Posting System

This is an Internal Job Posting System that allows companies to manage job postings and candidate applications. It consists of a frontend (Angular) and a backend (Spring Boot).


🚀 Getting Started

1️⃣ Prerequisites

Ensure you have the following installed:

Node.js & npm (for Angular frontend)

Angular CLI (npm install -g @angular/cli)

Java 17+ (for Spring Boot backend)

Maven (for building backend)

MySQL/PostgreSQL (or any database)

▶️ Run Backend

cd backend
mvn spring-boot:run

This starts the backend on http://localhost:8080.

3️⃣ Setting up the Frontend

📦 Install Dependencies

cd frontend
npm install

▶️ Run Frontend

ng serve

The app will be available at http://localhost:4200.

🛠️ Configuration

The frontend currently uses a hardcoded API URL (http://localhost:8080), which should be moved to environment.ts:

export const environment = {
  production: false,
  apiBaseUrl: 'http://localhost:8080'
};

Then update services to use:

private apiUrl = `${environment.apiBaseUrl}/jobs`;

🧪 Running Tests

🔍 Backend Tests

Run unit tests using:

mvn test

🔍 Frontend Tests

Run Angular unit tests using:

ng test


💡 Future Improvements

Implement authentication & authorization

Improve UI/UX design

Add notifications & email alerts

Enhance error handling in API calls

Search Filter operations for job listing and candidate listing