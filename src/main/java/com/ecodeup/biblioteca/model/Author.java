package com.ecodeup.biblioteca.model;

import com.ecodeup.biblioteca.dto.AuthorDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data //genera los getters y setters
@NoArgsConstructor //constructor vacio
@Entity //para que sea una entidad de la base de datos
@Table(name = "authors") //nombre de la tabla
public class Author {
    @Id //para que sea el id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String names;
    private String lastNames;
    private String cellphone;

    @OneToMany(mappedBy = "author")
    private List<Book> books;

    public Author(AuthorDTO authorDTO) {
        this.id = authorDTO.getId();
        this.names = authorDTO.getNames();
        this.lastNames = authorDTO.getLastNames();
        this.cellphone = authorDTO.getCellphone();
    }
}
