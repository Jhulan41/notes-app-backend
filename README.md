# 📝 Notes App Backend (Spring Boot)

A simple RESTful Notes management backend built using **Spring Boot**, following a clean architecture with services, controllers, entities, repositories, and global exception handling.

---

## 🚀 Features

- Create, Read, Update, Delete (CRUD) notes  
- REST APIs using Spring Web  
- JPA + Hibernate for database access  
- Global exception handling  
- Lombok for boilerplate reduction  
- Clean layered architecture  
- Maven-based Spring Boot project  

---

## 🗂️ Project Structure

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

## 📌 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 / MySQL** (your choice)
- **Lombok**
- **Maven**

---

## 📡 API Endpoints

### ✔️ Create a Note  
`POST /api/notes/newnote`

### ✔️ Get All Notes  
`GET /api/notes`

### ✔️ Get Note by ID  
`GET /api/notes/{id}`

### ✔️ Update Note  
`PUT /api/notes/{id}`

### ✔️ Delete Note  
`DELETE /api/notes/{id}`

---

## ▶️ How to Run

mvn spring-boot: run
The app will start at:
http://localhost:8080

---

## ✨ Author

**Jhulan Mahato**  
Full Stack Java Developer

---

If you want, I can also add:

✅ API Testing screenshots  
✅ JSON examples  
✅ Setup instructions with MySQL  
✅ Postman Collection  
✅ Badges (Build, License, Java version, Stars)  

Just tell me!


