package com.app.booksrestapi.web.controller;


import com.app.booksrestapi.model.entity.Author;
import com.app.booksrestapi.service.AuthorService;
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
    public ResponseEntity<Author> getSingleAuthor(@PathVariable("id") Long id) {
        return ResponseEntity.ok(authorService.getSingleAuthor(id));
    }


    @GetMapping("/first-name/{name}")
    public ResponseEntity<List<Author>> getAuthorsByFirstName(@PathVariable("name") String name) {
        return ResponseEntity.ok(authorService.getAllAuthorsByName(name, "first"));
    }

    @GetMapping("/last-name/{name}")
    public ResponseEntity<List<Author>> getAuthorsByLastName(@PathVariable("name") String name) {
        return ResponseEntity.ok(authorService.getAllAuthorsByName(name, "last"));
    }


}
