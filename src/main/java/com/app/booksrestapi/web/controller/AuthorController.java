package com.app.booksrestapi.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @GetMapping
    public void getAllAuthors() {
//        TODO get all authors
    }

    @GetMapping("/{id}")
    public void getSingleAuthor(@PathVariable("id") Long id) {
//        TODO get single author
    }

}
