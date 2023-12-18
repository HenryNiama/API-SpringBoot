package com.ecodeup.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@NoArgsConstructor
@Entity
@Table(name = "books")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String ISBN;
    private String name;
    private String editorial;
    private String genre;
    private int pages;
    private BigDecimal price;
    private LocalDate editionDate;
    @ManyToOne
    private Author author;
}

