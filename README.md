🏢 Internal Job Posting System

This is an Internal Job Posting System that allows companies to manage job postings and candidate applications. It consists of a frontend (Angular) and a backend (Spring Boot).

📂 Project Structure

internal-job-posting/
│── frontend/             # Angular application (UI)
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/   # UI components
│   │   │   ├── services/     # API services (Job & Candidate)
│   │   │   ├── models/       # Interfaces and data models
│   │   │   ├── app.module.ts # Main Angular module
│   ├── angular.json
│   ├── package.json
│── backend/              # Spring Boot REST API
│   ├── src/main/java/com/example/internaljobposting/
│   │   ├── controllers/  # REST controllers
│   │   ├── services/     # Business logic
│   │   ├── repositories/ # Database layer
│   ├── pom.xml           # Maven dependencies
│── README.md             # Project documentation
│── .gitignore

🚀 Getting Started

1️⃣ Prerequisites

Ensure you have the following installed:

Node.js & npm (for Angular frontend)

Angular CLI (npm install -g @angular/cli)

Java 17+ (for Spring Boot backend)

Maven (for building backend)

MySQL/PostgreSQL (or any database)

2️⃣ Setting up the Backend

🔧 Configure Database

Update application.properties in the backend:

spring.datasource.url=jdbc:mysql://localhost:3306/jobdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update

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

🔗 API Endpoints

Method

Endpoint

Description

GET

/jobs

Fetch all jobs

POST

/jobs

Create a new job

GET

/candidates

Fetch all candidates

POST

/candidates

Register a new candidate

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

🚀 Deployment

To deploy the frontend:

ng build --prod

This generates static files in dist/ that can be hosted on AWS S3, Vercel, Netlify, etc.

To deploy the backend:

mvn clean package

Deploy the JAR file on AWS EC2, Docker, Heroku, etc.

📝 Contributing

Fork the repo

Create a new branch (feature/xyz)

Commit changes (git commit -m "Added XYZ feature")

Push the branch (git push origin feature/xyz)

Open a Pull Request

📄 License

This project is MIT licensed.

💡 Future Improvements

Implement authentication & authorization

Improve UI/UX design

Add notifications & email alerts

Enhance error handling in API calls