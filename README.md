# 🚀 Job Portal REST API – Spring Boot

A production-style **Spring Boot RESTful API** that manages **Job Posts** with full CRUD operations using a clean layered architecture.

This project demonstrates **Java backend engineering**, **REST API design**, and **enterprise best practices** commonly used in real-world applications.

Ideal for:
- Java Backend Developer roles
- Full-Stack Developer portfolios
- Spring Boot learning
- Interview preparation

---

## ✨ Features

- Create job posts
- Fetch all jobs
- Fetch job by ID
- Update job details
- Delete job
- Layered architecture (Controller → Service → Repository → Model)
- RESTful API design
- Maven build
- Easy Postman testing

---

## 🛠 Tech Stack

| Technology | Purpose |
|-----------|----------|
| Java 17+ | Programming Language |
| Spring Boot | Backend Framework |
| Spring Web | REST APIs |
| Spring Data JPA | Data Access |
| Maven | Build Tool |
| H2 / MySQL | Database |
| Postman | API Testing |

---

## 📂 Project Structure

SpringBootRestApi
│
├── src/main/java/com/cremsi
│   ├── controller
│   │   └── JobRestController.java
│   │
│   ├── service
│   │   └── JobService.java
│   │
│   ├── repo
│   │   └── JobRepo.java
│   │
│   ├── model
│   │   └── JobPost.java
│   │
│   └── SpringbootRestApplication.java
│
├── src/main/resources
│   └── application.properties
│
└── pom.xml


---

## 🧠 Architecture

### Layer Responsibilities

### Controller
Handles HTTP requests and responses

### Service
Contains business logic

### Repository
Interacts with database

### Model
Entity/DTO classes

---

## ▶️ How to Run

### 1. Clone the repository
```bash
git clone https://github.com/saicremsinaidu/SpringBootRestApi.git
cd SpringBootRestApi

### Server URL
http://localhost:8080


