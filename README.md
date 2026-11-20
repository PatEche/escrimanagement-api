# EscriManagement API

Backend REST API for **EscriManagement**, a notarial office management system designed to centralize and organize information about people, notarial operations, properties and related documentation.

## 🚀 Project Status

**In Development**

The project is currently in its initial development stage. The backend foundation, database configuration and initial Person domain model have been implemented.

## 🛠️ Tech Stack

- **Language:** Java 21
- **Framework:** Spring Boot 4.1.2
- **Database:** PostgreSQL 16
- **ORM:** Spring Data JPA / Hibernate
- **Database Migrations:** Flyway
- **Validation:** Jakarta Bean Validation
- **Build Tool:** Maven
- **API Documentation:** SpringDoc OpenAPI / Swagger UI
- **Testing:** JUnit 5, Mockito

## 🏗️ Architecture

The application follows a **Modular Monolith** architecture, organized by business domains.

Each domain will progressively separate responsibilities into layers such as:

- Controller
- Service
- Repository
- Entity
- DTO
- Mapper

### Initial Domain Modules

- `person`: Management of individuals and legal entities.
- `operation`: Notarial operations.
- `property`: Property management.
- `document`: Document management.
- `user`: User and access management.
- `shared`: Shared application components.

## 🗄️ Database

PostgreSQL is used as the relational database.

Flyway manages database schema versioning and migrations.

Hibernate is configured with schema validation (`ddl-auto=validate`), leaving schema changes under Flyway's control.

## ⚙️ Local Setup

### Prerequisites

- Java 21
- Maven
- PostgreSQL 16

### Environment Configuration

Create a `.env` file in the project root using `.env.example` as a reference.

Configure the following variables:

| Variable | Description |
|---|---|
| `DB_URL` | PostgreSQL JDBC connection URL |
| `DB_USERNAME` | Database username |
| `DB_PASSWORD` | Database password |

**Important:** Never commit `.env` or expose database credentials.

### Run the Application

```bash
mvn spring-boot:run
```

### Run Tests and Build

```bash
mvn clean package
```

## 📖 API Documentation

Once the application is running, Swagger UI is available at:

```text
http://localhost:8080/swagger-ui/index.html
```

## 🛣️ Roadmap

- [x] Initial Spring Boot project setup
- [x] PostgreSQL integration
- [x] Flyway database migrations
- [x] Initial Person entity
- [x] Database integrity constraints
- [x] Environment variable configuration
- [ ] Person DTOs and validation
- [ ] Person repository
- [ ] Person service
- [ ] Person REST controller
- [ ] Unit and integration tests
- [ ] Authentication and authorization
- [ ] Additional business domains

## 👨‍💻 Author

**Patricio Echeverria**