package com.app.booksrestapi.service.impl;

import com.app.booksrestapi.model.entity.*;
import com.app.booksrestapi.repository.*;
import com.app.booksrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private LanguageRepository languageRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository,
                           AuthorRepository authorRepository,
                           LanguageRepository languageRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.languageRepository = languageRepository;
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

    @Override
    public List<Book> getAllBooksByLanguageCode(String lang_code) {

        Language lang = languageRepository.findFirstByCode(lang_code);
        return bookRepository.findAllByOriginalLanguage(lang);
    }

}
