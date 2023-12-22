package com.ecodeup.biblioteca.service;

import com.ecodeup.biblioteca.dto.BookDTO;
import com.ecodeup.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private FabricBookService fabricBookService;

    public BookDTO saveBook(BookDTO bookDTO){
        return fabricBookService.createBookDTO(bookRepository.save(fabricBookService.createBook(bookDTO)));
    }

    public List<BookDTO> getAllBooks(){
        return fabricBookService.createBookDTOList(bookRepository.findAll());
    }

    public BookDTO getBookById(Integer id){
        return fabricBookService.createBookDTO(bookRepository.findById(id).get());
    }

    public void deleteBookById(Integer id){
        bookRepository.deleteById(id);
    }

}
