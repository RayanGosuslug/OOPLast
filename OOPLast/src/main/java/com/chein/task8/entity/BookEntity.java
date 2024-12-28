package com.chein.task8.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "task")
@Accessors(chain = true)
public class BookEntity {

    @Id
    @Column(nullable = false, unique = true, name = "book_id")
    private UUID book_id;

    @Column(nullable = false, name = "book_type")
    private String book_type;

    @Column(nullable = true, name = "description")
    private String description;
}

