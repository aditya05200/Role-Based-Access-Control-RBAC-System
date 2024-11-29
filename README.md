# **Role-Based Access Control (RBAC) System**  

This project implements a secure and efficient **Role-Based Access Control (RBAC) System**. It ensures that only authorized users with appropriate roles can access specific features and resources of the application. The system includes a backend API for managing roles and permissions and a user-friendly frontend interface.  

---

## **Table of Contents**  

- [Features](#features)  
- [Tech Stack](#tech-stack)  
- [Architecture](#architecture)  
- [Installation](#installation)  
- [Usage](#usage)  
- [API Endpoints](#api-endpoints)  
- [Screenshots](#screenshots)  
- [Contributing](#contributing)  
- [License](#license)  

---

## **Features**  

1. **Authentication & Authorization**  
   - Token-based authentication using JWT.  
   - Role-based access control for different user types (Admin, User, etc.).  

2. **User Management**  
   - Register new users.  
   - Manage user roles and permissions.  

3. **CRUD Operations**  
   - Perform Create, Read, Update, Delete operations on users and roles.  

4. **Token Management**  
   - Access token with a 24-hour expiration.  
   - Refresh token implementation.  

5. **Responsive UI**  
   - Interactive and responsive frontend built with React.  

---

## **Tech Stack**  

### **Frontend**:  
- **React**  
- **CSS**  

### **Backend**:  
- **Java Spring Boot**  
- **JWT (JSON Web Tokens)**  

### **Database**:  
- **MySQL**  

### **Tools**:  
- **Postman** (for API testing)  
- **Git** (for version control)  
- **Docker** (optional for deployment)  

---

## **Architecture**  

The project follows a **three-layered architecture**:  
1. **Controller Layer**: Handles incoming requests and routes them to the appropriate services.  
2. **Service Layer**: Contains business logic and integrates with the repository layer.  
3. **Repository Layer**: Interacts with the database for data persistence.  

---

## **Installation**  

### **Prerequisites**  
- Java 17 or higher  
- Node.js and npm  
- MySQL  
- Git  

### **Setup Instructions**  

1. **Clone the Repository**  
   ```bash
   git clone https://github.com/aditya05200/Role-Based-Access-Control-RBAC-System.git
   cd Role-Based-Access-Control-RBAC-System
