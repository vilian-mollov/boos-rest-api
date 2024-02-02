package com.app.booksrestapi.service;

import com.app.booksrestapi.model.entity.Author;

import java.util.List;

public interface AuthorService {

    public List<Author> getAllAuthors();

    public Author getSingleAuthor(Long id);
}
