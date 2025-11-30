# 📝 Notes App Backend (Spring Boot)

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/SpringBoot-3.x-brightgreen)
![Build](https://img.shields.io/badge/Build-Maven-orange)
![Stars](https://img.shields.io/github/stars/Jhulan41/notes-app-backend?style=social)

A clean and simple **RESTful Notes Management Backend** built with **Spring Boot**, designed with service, controller, entity, repository layers and global exception handling.

---

## 🚀 Features

- 📌 Full CRUD for Notes  
- 🔗 REST APIs (JSON)  
- 🗄️ Spring Data JPA + Hibernate  
- 🛡️ Global Exception Handling  
- ✨ Lombok for clean code  
- 🗂️ Layered Architecture  
- 🧪 Postman-ready API design  

---

## 🗂️ Project Structure

```bash
notes-app-backend/
├── .mvn/
│   └── wrapper/
│       ├── maven-wrapper.jar
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── jhulan/
│   │   │           └── notesapp/
│   │   │               ├── controller/
│   │   │               ├── service/
│   │   │               ├── repository/
│   │   │               ├── entity/
│   │   │               └── exception/
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   └── test/
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

---

## 📡 API Endpoints

### ✔️ 1. Create a Note  
**POST** `/api/notes/newnote`

#### Request JSON:
```json
{
  "title": "My first note",
  "content": "This is a sample note"
}
```

#### Response JSON:
```json
{
  "id": 1,
  "title": "My first note",
  "content": "This is a sample note"
}
```

---

### ✔️ 2. Get All Notes  
**GET** `/api/notes`

#### Sample Response:
```json
[
  {
    "id": 1,
    "title": "First note",
    "content": "Some content"
  }
]
```

---

### ✔️ 3. Get Note By ID  
**GET** `/api/notes/{id}`

#### If ID not found:
```json
{
  "error": "Note not found with id 99"
}
```

---

### ✔️ 4. Update a Note  
**PUT** `/api/notes/{id}`

#### Request JSON:
```json
{
  "title": "Updated note",
  "content": "Updated content"
}
```

---

### ✔️ 5. Delete a Note  
**DELETE** `/api/notes/{id}`

#### Response:
```json
{
  "message": "Note deleted successfully"
}
```

---

## 🛡️ Global Exception Handling

Example error response:
```json
{
  "status": 404,
  "message": "Note not found with id 88"
}
```

---

## 🖼️ API Testing Screenshots

_Add screenshots of your Postman calls here._

Example:
```
📸 POST /newnote → Success  
📸 GET /notes → List of notes  
📸 PUT /notes/{id} → Updated note  
📸 DELETE /notes/{id} → Note deleted  
```

---

## 🧪 Postman Collection

You can export your Postman collection and place it inside:

```
/postman/notes-app-collection.json
```

Then add this in README:

```
📥 Download Postman Collection  
```

---

## 🛠️ Setup Instructions (MySQL)

### 1️⃣ Create a database
```sql
CREATE DATABASE notesdb;
```

### 2️⃣ Update `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/notesdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3️⃣ Run the project
```
mvn spring-boot:run
```

Application starts at:

👉 http://localhost:8080

---

## ▶️ Running With H2 (Optional)

If you prefer in-memory database:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
```

---

## ✨ Author

**👨‍💻 Jhulan Mahato**  
Full Stack Java Developer  
Passionate about backend development & scalable applications.

---
