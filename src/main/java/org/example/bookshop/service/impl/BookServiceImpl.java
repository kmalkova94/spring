package org.example.bookshop.service.impl;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.BookDto;
import org.example.bookshop.repository.BookRepository;
import org.example.bookshop.service.BookService;
import org.springframework.core.convert.ConversionService;

import java.util.List;

@AllArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final ConversionService conversionService;

    @Override
    public BookDto getBookById(Long id) {
        return null;
    }

    @Override
    public List<BookDto> getAllBooks() {
        return null;
    }

    @Override
    public BookDto createBooks(BookDto bookDto) {
        return null;
    }

    @Override
    public BookDto updateBooks(BookDto bookDto) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}
