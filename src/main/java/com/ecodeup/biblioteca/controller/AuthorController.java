package com.ecodeup.biblioteca.controller;

import com.ecodeup.biblioteca.dto.AuthorDTO;
import com.ecodeup.biblioteca.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/biblioteca")
public class AuthorController {

    @Autowired
    private AuthorService authorService;


    //Metodo para guardar Author
    @PostMapping
    public ResponseEntity<AuthorDTO> save(@RequestBody AuthorDTO authorDTO){
        return new ResponseEntity<>(authorService.saveAuthor(authorDTO), HttpStatus.OK);
    }

}
