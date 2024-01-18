package com.app.booksrestapi.model.entity;

import jakarta.persistence.*;
import org.hibernate.type.descriptor.java.UUIDJavaType;

import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(columnDefinition = "BINARY(16)")
//    private UUID uuid;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    public UUID getUuid() {
//        return uuid;
//    }
//
//    public void setUuid(UUID uuid) {
//        this.uuid = uuid;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
