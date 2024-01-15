package com.app.booksrestapi.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public void getAllBooks() {
//        TODO get all books
    }

    @GetMapping("/{id}")
    public void getSingleBook(@PathVariable("id") Long id) {
//        TODO get single book
    }


}
