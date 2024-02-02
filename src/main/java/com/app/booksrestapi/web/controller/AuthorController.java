package com.app.booksrestapi.web.controller;


import com.app.booksrestapi.model.entity.Author;
import com.app.booksrestapi.service.AuthorService;
import com.app.booksrestapi.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping
    public ResponseEntity<List<Author>> getAllAuthors() {
        return ResponseEntity.ok(authorService.getAllAuthors());
    }

    @GetMapping("/{id}")
    public void getSingleAuthor(@PathVariable("id") Long id) {
//        TODO get single author
    }

}
