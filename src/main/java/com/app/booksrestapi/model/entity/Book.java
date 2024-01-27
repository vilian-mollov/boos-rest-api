package com.app.booksrestapi.model.entity;

import com.app.booksrestapi.model.entity.enums.Cover;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {

    @Column
    private String title;

    @Column
    private Integer pages;

    @Column
    private Double weight;

    @Enumerated
    @Column
    private Cover cover;
//
//    @Column
//    private Language originalLanguage;
////    private List<Language> languages;
//
//    @Column
//    private String isbn;

    public Book() {
    }

    public Book(String title, Integer pages, Double weight, Cover cover) {
        this.title = title;
        this.pages = pages;
        this.weight = weight;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

//    public Language getOriginalLanguage() {
//        return originalLanguage;
//    }
//
//    public void setOriginalLanguage(Language originalLanguage) {
//        this.originalLanguage = originalLanguage;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
}
