package com.ecodeup.biblioteca.service;

import com.ecodeup.biblioteca.dto.BookDTO;
import com.ecodeup.biblioteca.model.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FabricBookService {

    public Book createBook(BookDTO bookDTO) {
        return new Book(bookDTO);
    }

    public BookDTO createBookDTO(Book book) {
        return new BookDTO(book);
    }

    public List<BookDTO> createBookDTOList(List<Book> books) {
        List<BookDTO> bookDTOs = new ArrayList<>();
        for (Book book : books) {
            bookDTOs.add(createBookDTO(book));
        }
        return bookDTOs;
    }


}
