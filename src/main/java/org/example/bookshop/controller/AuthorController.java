package org.example.bookshop.controller;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.AddressDto;
import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.exceptions.AddressException;
import org.example.bookshop.exceptions.AuthorException;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/author")
public class AuthorController {
    private final AuthorService authorService;
    @GetMapping(value = "/{authorId}")
    public AuthorDto getAuthorId(@PathVariable("id") Long id) throws AuthorException {
        return authorService.getAuthorById(id);
    }
    @GetMapping
    public List<AuthorDto> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @PostMapping
    public AuthorDto createAuthor(@RequestBody AuthorDto authorDto) {
        return authorService.createAuthor(authorDto);
    }

    @PutMapping
    public AuthorDto updateAuthor(@RequestBody AuthorDto authorDto) throws AuthorException {
        return authorService.updateAuthor(authorDto);
    }

    @DeleteMapping
    public void deleteAuthor(@PathVariable("id") Long id) throws AuthorException {
        authorService.deleteAuthor(id);
    }
}
