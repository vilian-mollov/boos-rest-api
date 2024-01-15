package com.app.booksrestapi.model.entity;

import com.app.booksrestapi.model.entity.enums.Cover;
import com.app.booksrestapi.model.entity.enums.Language;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Book extends BaseEntity {

    private String title;
    private int pages;
    private float weight;
    private Cover cover;
    private Language originalLanguage;
//    private List<Language> languages;
    private String isbn;
}
