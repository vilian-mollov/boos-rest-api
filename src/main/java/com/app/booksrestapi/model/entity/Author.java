package com.app.booksrestapi.model.entity;

import com.app.booksrestapi.model.entity.enums.Country;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private Country citizenship;
    private Timestamp bornOn;
    private Timestamp diedOn;
}
