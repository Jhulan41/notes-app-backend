📒 Notes App Backend

Spring Boot REST API for creating, updating, deleting, and managing personal notes.

🚀 Features

Create, update, delete, and retrieve notes

REST API using Spring Boot

MySQL (or H2) database support

Exception handling (custom exceptions)

Layered architecture (Controller → Service → Repository)

🗂️ Project Structure
notes-app-backend/
 ├── src/
 │   ├── main/
 │   │   ├── java/com/jhulan/notesapp/
 │   │   │    ├── controller/
 │   │   │    ├── service/
 │   │   │    ├── repository/
 │   │   │    ├── entity/
 │   │   │    ├── exception/
 │   │   └── resources/
 │   │        ├── application.properties
 ├── pom.xml
 ├── mvnw / mvnw.cmd
 └── README.md

🛠️ Tech Stack

Java 17+

Spring Boot

Spring Web

Spring Data JPA

MySQL (or H2 for in–memory)

Maven

⚙️ How to Run Locally
1️⃣ Clone the repo
git clone https://github.com/Jhulan41/notes-app-backend.git
cd notes-app-backend

2️⃣ Configure DB (MySQL)

In src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/notes_app
spring.datasource.username=root
spring.datasource.password=yourPassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Run the project

Using Maven Wrapper:

./mvnw spring-boot:run


Or from IntelliJ → Run Application.

📡 API Endpoints
➤ Create a note
POST /api/notes


Body:

{
  "title": "Demo",
  "content": "This is a new note"
}

➤ Get all notes
GET /api/notes

➤ Get note by ID
GET /api/notes/{id}

➤ Update a note
PUT /api/notes/{id}

➤ Delete a note
DELETE /api/notes/{id}

🧰 Build
./mvnw clean install

🧑‍💻 Developer

Jhulan Mahato
Backend Developer · Java/Spring Boot
