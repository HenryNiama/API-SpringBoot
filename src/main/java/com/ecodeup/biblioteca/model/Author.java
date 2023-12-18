package com.ecodeup.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
