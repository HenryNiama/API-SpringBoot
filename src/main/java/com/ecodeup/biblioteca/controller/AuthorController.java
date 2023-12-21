package com.ecodeup.biblioteca.controller;

import com.ecodeup.biblioteca.dto.AuthorDTO;
import com.ecodeup.biblioteca.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/biblioteca")
public class AuthorController {

    @Autowired
    private AuthorService authorService;


    //Metodo para guardar Author
    @PostMapping
    public ResponseEntity<AuthorDTO> save(@RequestBody AuthorDTO authorDTO){
        return new ResponseEntity<>(authorService.saveAuthor(authorDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List <AuthorDTO>> getAll(){
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> getById(@PathVariable("id") Integer id){

        try {
            return new ResponseEntity<>(authorService.getAuthorById(id), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteById(@PathVariable("id") Integer id){
        try {
            authorService.deleteAuthorById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
