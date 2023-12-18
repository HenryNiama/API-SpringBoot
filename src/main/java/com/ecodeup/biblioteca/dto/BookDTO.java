package com.ecodeup.biblioteca.dto;


import com.ecodeup.biblioteca.model.Book;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class BookDTO {

    private Integer id;
    private String ISBN;
    private String name;
    private String editorial;
    private String genre;
    private int pages;
    private BigDecimal price;
    private LocalDate editionDate;
    private AuthorDTO authorDTO;

    public BookDTO(Book book) {
        this.id = book.getId();
        this.ISBN = book.getISBN();
        this.name = book.getName();
        this.editorial = book.getEditorial();
        this.genre = book.getGenre();
        this.pages = book.getPages();
        this.price = book.getPrice();
        this.editionDate = book.getEditionDate();
        this.authorDTO = new AuthorDTO(book.getAuthor());
    }


}
