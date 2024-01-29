package com.app.booksrestapi.service;

import com.app.booksrestapi.model.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();

    public Book getBookById(Long id);

    public List<Book> getAllBooksByAuthorId(Long authorId);
}
