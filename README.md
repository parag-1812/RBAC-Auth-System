Role-Based Access Control (RBAC) System
   -> A robust implementation of Authentication, Authorization, and Role-Based Access Control (RBAC) designed to showcase secure access management in applications.
   
   --------------------------------------------------------------------------------------------------

   🚀 Features
      - User Authentication: Secure user login and registration using JWT tokens.
      - Authorization: Grant or restrict access based on user roles.
      - RBAC: Control access to resources with role-based permissions (ADMIN, USER, etc.).
      - Endpoints: Includes public, role-specific, and protected APIs.
    --------------------------------------------------------------------------------------------------
    📂 Project Structure
        src
        ├── config           # Security configurations (Spring Security, JWT setup)
        ├── controller       # API endpoints for authentication and RBAC
        ├── filter           # JWT Authentication filter
        ├── model            # Entity classes for User and AuthenticationResponse
        ├── repository       # JPA repository for database interactions
        ├── service          # Business logic for authentication and role management
        └── utils            # JWT token generation and validation utilities
    --------------------------------------------------------------------------------------------------
    🛠️ Technologies Used
       - Backend: Spring Boot
       - Security: Spring Security, JWT
       - Database: MySQL
       - Build Tool: Maven
       - Language: Java
       - Tools: Postman (for API testing)
    --------------------------------------------------------------------------------------------------
    📋 API Endpoints
        1. User Registration
         - Endpoint: /register
         - Method: POST
         - Request Body:
           {
                "firstName": "Parag",
                "lastName": "Gupta",
                "userName": "parag-1812",
                "password": "123456",
                "role": "ADMIN"
            }
          -Response:
            {
                "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
            }
        2. User Login
         - Endpoint: /login
         - Method: POST
         - Request Body:
            {
                "userName": "parag-1812",
                "password": "123456"
            }
         - Response:
            {
                "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
            }
        3. Public Endpoint
          - Endpoint: /demo
          - Method: GET
          - Description: Publicly accessible endpoint.
        4. Admin-Only Endpoint
         - Endpoint: /admin_only
         - Method: POST
         - Authorization:
                 - Auth Type: Bearer Token
         - Response:
                   Hello This Is Admin
    --------------------------------------------------------------------------------------------------
    📝 How to Run the Project
       - Setup Instructions
         1- Clone the repository:
            git clone https://github.com/<your-username>/RBAC-Auth-System.git
         2- Navigate to the project directory:
            cd RBAC-Auth-System
         3- Configure the database in application.properties:
            spring.datasource.url=jdbc:mysql://localhost:3306/<your-database>
            spring.datasource.username=<your-username>
            spring.datasource.password=<your-password>
         4- Build the project:
            mvn clean install
         5- Run the application:
            mvn spring-boot:run
     --------------------------------------------------------------------------------------------------
     


    

