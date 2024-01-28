package com.app.booksrestapi.model.entity;

import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "countries")
public class Country {

    @Id
    @NonNull
    @Column(length = 2)
    private String code;

    @Column(length = 100)
    private String name;

    @Column(length = 100)
    private String officialStateName;
}
