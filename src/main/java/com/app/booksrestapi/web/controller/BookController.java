package com.app.booksrestapi.web.controller;

import com.app.booksrestapi.model.entity.Book;
import com.app.booksrestapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/book/{id}")
    public Book getSingleBook(@PathVariable("id") Long id) {
        return bookService.getBookById(id);
    }


    @GetMapping("lang/{lng_code}")
    public ResponseEntity<List<Book>> getAllBooksByLanguage(@PathVariable("lng_code") String lng_code) {
        return ResponseEntity.ok(bookService.getAllBooksByLanguageCode(lng_code));
    }


    @GetMapping("/author/{id}")
    public ResponseEntity<List<Book>> getAllBooksByAuthorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bookService.getAllBooksByAuthorId(id));
    }


}
