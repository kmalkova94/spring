package org.example.bookshop.controller;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.dto.BookDto;
import org.example.bookshop.exceptions.AuthorException;
import org.example.bookshop.exceptions.BookException;
import org.example.bookshop.exceptions.PublisherException;
import org.example.bookshop.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/book")
public class BookController {
    private final BookService bookService;
    @GetMapping(value = "/{bookId}")
    public BookDto getBookId(@PathVariable("id") Long id) throws BookException {
        return bookService.getBookById(id);
    }
    @GetMapping
    public List<BookDto> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public BookDto createBook(@RequestBody BookDto bookDto) {
        return bookService.createBooks(bookDto);
    }

    @PutMapping
    public BookDto updateBook(@RequestBody BookDto bookDto) throws AuthorException, BookException, PublisherException {
        return bookService.updateBooks(bookDto);
    }

    @DeleteMapping
    public void deleteBook(@PathVariable("id") Long id) throws BookException {
        bookService.deleteBook(id);
    }
}
