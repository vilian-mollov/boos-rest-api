package com.app.booksrestapi.model.entity;

import com.app.booksrestapi.model.entity.enums.Cover;
import com.app.booksrestapi.model.entity.enums.Language;
import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {

    @Column
    private String title;

    @Column
    private int pages;

    @Column
    private float weight;

    @Column
    private Cover cover;

    @Column
    private Language originalLanguage;
//    private List<Language> languages;

    @Column
    private String isbn;

    public Book() {
    }

    public Book(String title, int pages, float weight, Language originalLanguage, String isbn) {
        this.title = title;
        this.pages = pages;
        this.weight = weight;
        this.originalLanguage = originalLanguage;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public Language getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(Language originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
