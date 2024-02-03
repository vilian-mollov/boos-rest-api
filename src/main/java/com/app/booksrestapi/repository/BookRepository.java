package com.app.booksrestapi.repository;

import com.app.booksrestapi.model.entity.Author;
import com.app.booksrestapi.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    Book findFirstById(Long id);

    List<Book> findAllByAuthor(Author author);

}
