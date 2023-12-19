package com.ecodeup.biblioteca.service;

import com.ecodeup.biblioteca.dto.AuthorDTO;
import com.ecodeup.biblioteca.model.Author;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FabricAuthorService {

    public Author createAuthor(AuthorDTO authorDTO) {
        return new Author(authorDTO);
    }

    public AuthorDTO createAuthorDTO(Author author) {
        return new AuthorDTO(author);
    }

    public List<AuthorDTO> createAuthorDTOList(List<Author> authors) {
        List<AuthorDTO> authorDTOs = new ArrayList<>();
        for (Author author : authors) {
            authorDTOs.add(createAuthorDTO(author));
        }
        return authorDTOs;
    }

}

