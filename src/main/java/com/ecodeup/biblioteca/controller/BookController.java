package com.ecodeup.biblioteca.controller;


import com.ecodeup.biblioteca.dto.BookDTO;
import com.ecodeup.biblioteca.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/biblioteca/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookDTO> save(@RequestBody BookDTO bookDTO){
        try {
            return new ResponseEntity<>(bookService.saveBook(bookDTO), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


    @GetMapping
    public ResponseEntity<List<BookDTO>> getAll(){
        try {
            return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }


}
