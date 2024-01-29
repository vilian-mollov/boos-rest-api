package com.app.booksrestapi.service.impl;

import com.app.booksrestapi.model.entity.Author;
import com.app.booksrestapi.model.entity.Book;
import com.app.booksrestapi.repository.AuthorRepository;
import com.app.booksrestapi.repository.BookRepository;
import com.app.booksrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository,
                           AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findFirstById(id);
    }

    @Override
    public List<Book> getAllBooksByAuthorId(Long authorId) {

        Author author = authorRepository.findFirstById(authorId);

        List<Book> books = bookRepository.findAllByAuthor(author);

        return books;
    }

}
