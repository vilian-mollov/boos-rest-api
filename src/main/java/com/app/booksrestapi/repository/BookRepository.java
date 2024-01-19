package com.app.booksrestapi.repository;

import com.app.booksrestapi.model.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

//    @Override
////    @Transactional(timeout = 10)
//    List<Book> findAll();

    Optional<Book> findFirstById(Long id);

}
