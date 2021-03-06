package com.martinez.service;

import com.martinez.entities.Book;

import java.util.List;

public interface BookService {

    List<Book> findByTitle(String title);

    List<Book> findAll();

    Book saveBook(Book book);

    Book findByIsbn(String isbn);

    void deleteBook(String isbn);
}
