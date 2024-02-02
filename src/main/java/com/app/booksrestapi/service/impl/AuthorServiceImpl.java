package com.app.booksrestapi.service.impl;

import com.app.booksrestapi.model.entity.Author;
import com.app.booksrestapi.repository.AuthorRepository;
import com.app.booksrestapi.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getSingleAuthor(Long id) {
       return authorRepository.findFirstById(id);
    }
}
