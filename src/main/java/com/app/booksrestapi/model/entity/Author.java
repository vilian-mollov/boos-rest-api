package com.app.booksrestapi.model.entity;

import jakarta.persistence.*;
import java.time.Year;

@Entity
@Table(name = "authors")
public class Author extends BaseEntity {

    @Column(length = 40)
    private String firstName;

    @Column(length = 40)
    private String middleName;

    @Column(length = 40)
    private String lastName;

    @Column
    private Integer age;

    @ManyToOne
    private Country citizenship;

    @Column(length = 4)
    private Integer bornOn;

    @Column(length = 4)
    private Integer diedOn;

    public Author() {
    }

    public Author(String firstName, String middleName, String lastName, Integer age, Country citizenship, Integer bornOn, Integer diedOn) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.bornOn = bornOn;
        this.diedOn = diedOn;
        this.citizenship = citizenship;
        this.setAge(this.calculateAge(bornOn, diedOn));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Country getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(Country citizenship) {
        this.citizenship = citizenship;
    }

    public Integer getBornOn() {
        return bornOn;
    }

    public void setBornOn(Integer bornOn) {
        this.bornOn = bornOn;
    }

    public Integer getDiedOn() {
        return diedOn;
    }

    public void setDiedOn(Integer diedOn) {
        this.diedOn = diedOn;
    }

    private Integer calculateAge(Integer bornOn, Integer diedOn) {
        Integer age;
        if(diedOn == null) {
            age = Year.now().getValue() - bornOn;
        }else {
            age = diedOn - bornOn;
        }


        return age;
    }

    public void refreshAge() {
        this.setAge(calculateAge(this.bornOn, this.diedOn));
    }
}
