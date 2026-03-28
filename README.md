# 🚀 Student Management API (Spring Boot)

## 📌 Overview
This project is a RESTful Student Management API built using Spring Boot.  
It demonstrates real-world backend concepts such as CRUD operations, layered architecture, and global exception handling.

---

## ✨ Features
- Create Student
- Get All Students
- Get Student by ID
- Update Student (PUT)
- Partial Update (PATCH)
- Delete Student
- Global Exception Handling

---

## 🧠 Concepts Used
- Spring Boot
- REST API Design
- Dependency Injection
- Layered Architecture (Controller → Service → Repository)
- Exception Handling (@RestControllerAdvice)
- HTTP Status Codes

---

## 🛠️ Tech Stack
- Java
- Spring Boot
- Maven

---

## 📁 Project Structure
```
controller
exception
exception/handler
model
repository
service
```

---

## 🌐 API Endpoints

### ➕ Create Student
```
POST /api/students
```

**Request Body:**
```json
{
  "name": "Bhanu"
}
```

---

### 📄 Get All Students
```
GET /api/students
```

---

### 🔍 Get Student by ID
```
GET /api/students/{id}
```

---

### 🔄 Update Student (PUT)
```
PUT /api/students/{id}
```

---

### ✏️ Partial Update (PATCH)
```
PATCH /api/students/{id}
```

**Example Body:**
```json
{
  "name": "Updated Name"
}
```

---

### ❌ Delete Student
```
DELETE /api/students/{id}
```

---

## ⚠️ Error Handling

Example response:
```json
{
  "message": "Student not found with id 1"
}
```

---

## ▶️ How to Run
1. Clone the repository
2. Open the project in IntelliJ IDEA
3. Run `StudentApplication`
4. Test APIs using Postman or any API client

---

## 🧪 Testing
Use Postman, Insomnia, or curl to test the API endpoints.

---

## 📌 Author
Bhanu