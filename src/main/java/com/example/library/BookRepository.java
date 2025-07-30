package com.example.library;

import org.springframework.data.jpa.repository.JpaRepository;

//Spring Boot auto-generates methods. so no coding required here
public interface BookRepository extends JpaRepository<Book, Long> {
}
