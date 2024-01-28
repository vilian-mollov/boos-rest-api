package com.app.booksrestapi.init;

import com.app.booksrestapi.model.entity.Author;
import com.app.booksrestapi.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class InitialAuthors implements CommandLineRunner {

    AuthorRepository authorRepository;

    @Autowired
    public InitialAuthors(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Author> all = authorRepository.findAll();

        for (Author author : all) {
            author.refreshAge();
            authorRepository.save(author);
        }

    }

}
