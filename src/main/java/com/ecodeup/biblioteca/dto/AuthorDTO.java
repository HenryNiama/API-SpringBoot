package com.ecodeup.biblioteca.dto;


import com.ecodeup.biblioteca.model.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class AuthorDTO {

    private Integer id;
    private String names;
    private String lastNames;
    private String cellphone;

    private List<BookDTO> booksDTO;

    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.names = author.getNames();
        this.lastNames = author.getLastNames();
        this.cellphone = author.getCellphone();
        this.booksDTO = new ArrayList<>();
        author.getBooks().forEach(book -> this.booksDTO.add(new BookDTO(book)));
    }
}
