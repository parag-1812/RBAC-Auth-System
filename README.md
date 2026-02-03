# Role-Based Access Control (RBAC) System

A secure and well-structured backend application demonstrating **Authentication, Authorization, and Role-Based Access Control (RBAC)** using modern Spring Boot practices.  
This project is designed to showcase how real-world applications protect APIs using **JWT tokens** and **role-based permissions**.

---

## 🚀 Features

- **User Authentication**
  - Secure user registration and login using JWT-based authentication.

- **Authorization & RBAC**
  - Role-based access control for different user roles such as `ADMIN` and `USER`.
  - Restricts access to APIs based on assigned roles.

- **Protected APIs**
  - Public endpoints accessible without authentication.
  - Role-specific and protected endpoints secured via JWT tokens.

---

## 📂 Project Structure

src

├── config # Spring Security and JWT configuration.

├── controller # REST controllers for authentication and APIs.

├── filter # JWT authentication filter.

├── model # Entity classes and authentication response models.

├── repository # JPA repositories for database access.

├── service # Business logic for authentication and role handling.

└── utils # JWT token generation and validation utilities.


---

## 🛠️ Technologies Used

- **Backend:** Spring Boot  
- **Security:** Spring Security, JWT  
- **Database:** MySQL  
- **Build Tool:** Maven  
- **Language:** Java  
- **API Testing:** Postman  

---

## 📋 API Endpoints

### 1️⃣ User Registration
- **Endpoint:** `/register`
- **Method:** `POST`
- **Request Body:**
```json
{
  "firstName": "Parag",
  "lastName": "Gupta",
  "userName": "parag-1812",
  "password": "123456",
  "role": "ADMIN"
}
Response:
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}

2️⃣ User Login

1- Endpoint: /login

2- Method: POST

3- Request Body: {
  "userName": "parag-1812",
  "password": "123456"
}
5- Response:
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}





