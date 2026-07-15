************ Visitor Log API ************



##Project Overview

Visitor Log API is a simple Spring Boot REST API designed to manage visitor records for a training center or front desk system. It allows users to add, view, update, delete, and search visitors through RESTful endpoints.
The application stores visitor data in memory using a Java List, so all data will be removed when the application restarts.


##Technologies Used

- Java 17+
- Spring Boot 3.x
- Maven
- Spring Web
- Docker
- Git & GitHub


##Project Structure

src/main/java/com/example/visitorlog

Controller
 VisitorController.java

Service
 VisitorService.java

Entity
 Visitor.java

VisitorlogApplication.java
Dockerfile
pom.xml
README.md

#API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/visitors` | Get all visitors |
| GET | `/api/visitors/{id}` | Get visitor by ID |
| POST | `/api/visitors` | Add a new visitor |
| DELETE | `/api/visitors/{id}` | Delete visitor by ID |
| GET | `/api/visitors/count` | Get total number of visitors |
| GET | `/api/health` | Check application health |
| PUT | `/api/visitors/{id}` | Update visitor information |
| GET | `/api/visitors?purpose=meeting` | Filter visitors by purpose |



##The Visitor object contains:

| Field | Type | Description |
|------|------|-------------|
| id | Long | Unique visitor ID |
| name | String | Visitor name |
| company | String | Visitor company |
| purpose | String | Visit purpose |

Example JSON:
{
    "name": "Ahmed",
    "company": "Oman Tech",
    "purpose": "meeting"
}
