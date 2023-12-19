package com.ecodeup.biblioteca.model;

import com.ecodeup.biblioteca.dto.BookDTO;
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


    public Book(BookDTO bookDTO) {
        this.id = bookDTO.getId();
        this.ISBN = bookDTO.getISBN();
        this.name = bookDTO.getName();
        this.editorial = bookDTO.getEditorial();
        this.genre = bookDTO.getGenre();
        this.pages = bookDTO.getPages();
        this.price = bookDTO.getPrice();
        this.editionDate = bookDTO.getEditionDate();
        this.author = new Author(bookDTO.getAuthorDTO());
    }
}

