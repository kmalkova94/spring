package org.example.bookshop.service;

import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.exceptions.AuthorException;

import java.util.List;

public interface AuthorService {
    AuthorDto getAuthorById(Long id) throws AuthorException;
    List<AuthorDto> getAllAuthors();
    AuthorDto createAuthor(AuthorDto authorDto);
    AuthorDto updateAuthor(AuthorDto authorDto) throws AuthorException;
    void deleteAuthor(Long id) throws AuthorException;
}
