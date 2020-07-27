package org.example.bookshop.service;

import org.example.bookshop.dto.BookDto;
import org.example.bookshop.exceptions.AuthorException;
import org.example.bookshop.exceptions.BookException;
import org.example.bookshop.exceptions.PublisherException;

import java.util.List;

public interface BookService {
    BookDto getBookById(Long id) throws BookException;
    List<BookDto> getAllBooks();
    BookDto createBooks(BookDto bookDto);
    BookDto updateBooks(BookDto bookDto) throws BookException, AuthorException, PublisherException;
    void deleteBook(Long id) throws BookException;
}
