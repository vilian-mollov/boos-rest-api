package com.app.booksrestapi.repository;

import com.app.booksrestapi.model.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    Author findFirstById(Long id);

    List<Author> findAllByFirstName(String firstName);

    List<Author> findAllByLastName(String lastName);

}
