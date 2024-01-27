package com.app.booksrestapi.model.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "languages")
public class Language {

    @Id
    @NonNull
    @Column(length = 2)
    private String code;

    @Column(length = 35)
    private String name;

    public Language() {
    }

    public Language(@NonNull String code, String name) {
        this.code = code;
        this.name = name;
    }

    @NonNull
    public String getCode() {
        return code;
    }

    public void setCode(@NonNull String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
