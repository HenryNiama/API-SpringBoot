package com.ecodeup.biblioteca.dto;


import com.ecodeup.biblioteca.model.Author;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthorDTO {

    private Integer id;
    private String names;
    private String lastNames;
    private String cellphone;

    public AuthorDTO(Author author) {
        this.id = author.getId();
        this.names = author.getNames();
        this.lastNames = author.getLastNames();
        this.cellphone = author.getCellphone();
    }
}
