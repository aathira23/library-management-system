# 📚 Library Management System
A simple Spring Boot backend for managing books in a small library.

## Features
- Add a new book
- View all books / by ID
- Update book details by ID
- Delete a book by ID

## Entity
- **Book**: `id`, `title`, `author`, `genre`, `published_year`
  
## Tech Stack
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven

## API Endpoints
| Method | Endpoint      | Action            |
|--------|---------------|-------------------|
| POST   | `/books`      | Add book          |
| GET    | `/books`      | Get all books     |
| GET    | `/books/{id}` | Get book by ID    |
| PUT    | `/books/{id}` | Update book       |
| DELETE | `/books/{id}` | Delete book       |

