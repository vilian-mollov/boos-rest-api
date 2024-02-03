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

    public Country() {
    }

    public Country(@NonNull String code, String name, String officialStateName) {
        this.code = code;
        this.name = name;
        this.officialStateName = officialStateName;
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

    public String getOfficialStateName() {
        return officialStateName;
    }

    public void setOfficialStateName(String officialStateName) {
        this.officialStateName = officialStateName;
    }
}
