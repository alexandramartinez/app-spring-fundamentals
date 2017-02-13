package com.martinez.repository;

import com.martinez.entities.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
    public List<Book> findByTitleLike(String nombre);

}