package com.example.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private String genre;

    private int published_year;

    // Constructors
    public Book() {
    }

    public Book(Long id, String title, String author, String genre, int published_year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.published_year = published_year;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @JsonProperty("published_year")
    public int getPublishedYear() {
        return published_year;
    }

    @JsonProperty("published_year")
    public void setPublishedYear(int published_year) {
        this.published_year = published_year;
    }
}
