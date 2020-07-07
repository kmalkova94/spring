package org.example.bookshop.service.impl;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.entity.Author;
import org.example.bookshop.exceptions.AuthorException;
import org.example.bookshop.repository.AuthorRepositry;
import org.example.bookshop.service.AuthorService;
import org.springframework.core.convert.ConversionService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepositry authorRepositry;
    private final ConversionService conversionService;

    @Override
    public AuthorDto getAuthorById(Long id) throws AuthorException{
        Author author = authorRepositry.findById(id).orElseThrow(() -> new AuthorException("Author not found"));
        return conversionService.convert(author, AuthorDto.class);
    }

    @Override
    public List<AuthorDto> getAllAuthors() {
        List<Author> authors = authorRepositry.findAll();
        return authors.stream().map(author -> conversionService.convert(author, AuthorDto.class)).collect(Collectors.toList());
    }

    @Override
    public AuthorDto createAuthor(AuthorDto authorDto) {
        Author author = conversionService.convert(authorDto, Author.class);
        return conversionService.convert(authorRepositry.save(author), AuthorDto.class);
    }

    @Override
    public AuthorDto updateAuthor(AuthorDto authorDto) throws AuthorException {
        Author author = authorRepositry.findById(authorDto.getId()).orElseThrow(() -> new AuthorException("Author not found"));
        author.setName(authorDto.getName());
        return conversionService.convert(authorRepositry.save(author), AuthorDto.class);
    }

    @Override
    public void deleteAuthor(Long id) throws AuthorException {
        Author author = authorRepositry.findById(id).orElseThrow(() -> new AuthorException("Author not found"));
        authorRepositry.delete(author);
    }

}
