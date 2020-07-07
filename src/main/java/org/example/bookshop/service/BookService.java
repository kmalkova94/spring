package org.example.bookshop.service;

import org.example.bookshop.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto getBookById(Long id);
    List<BookDto> getAllBooks();
    BookDto createBooks(BookDto bookDto);
    BookDto updateBooks(BookDto bookDto);
    void deleteBook(Long id);
}
