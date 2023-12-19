package com.ecodeup.biblioteca.service;

import com.ecodeup.biblioteca.dto.AuthorDTO;
import com.ecodeup.biblioteca.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthorService {

    @Autowired
    private FabricAuthorService fabricAuthorService;

    @Autowired
    private AuthorRepository authorRepository;

    //Metodo para guardar Author
    public AuthorDTO saveAuthor(AuthorDTO authorDTO){
        return fabricAuthorService.createAuthorDTO(authorRepository.save(fabricAuthorService.createAuthor(authorDTO)));
    }

    //Retornar todos los autores
    public List<AuthorDTO> getAllAuthors(){
        return fabricAuthorService.createAuthorDTOList(authorRepository.findAll());
    }

    //Retornar un autor por id
    public AuthorDTO getAuthorById(Integer id){
        return fabricAuthorService.createAuthorDTO(authorRepository.findById(id).get());
    }

    //Eliminar un autor por id
    public void deleteAuthorById(Integer id){
        authorRepository.deleteById(id);
    }
}
