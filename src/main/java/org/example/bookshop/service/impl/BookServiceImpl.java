package org.example.bookshop.service.impl;

import org.example.bookshop.dto.BookDto;
import org.example.bookshop.entity.Book;
import org.example.bookshop.exceptions.AuthorException;
import org.example.bookshop.exceptions.BookException;
import org.example.bookshop.exceptions.PublisherException;
import org.example.bookshop.repository.AuthorRepositry;
import org.example.bookshop.repository.BookRepository;
import org.example.bookshop.repository.PublisherRepository;
import org.example.bookshop.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final AuthorRepositry authorRepositry;
    private final PublisherRepository publisherRepository;
    private final ConversionService conversionService;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, AuthorRepositry authorRepositry, PublisherRepository publisherRepository, ConversionService conversionService) {
        this.bookRepository = bookRepository;
        this.authorRepositry = authorRepositry;
        this.publisherRepository = publisherRepository;
        this.conversionService = conversionService;
    }

    @Override
    public BookDto getBookById(Long id) throws BookException {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookException("Book is not found"));
        return conversionService.convert(book, BookDto.class);
    }

    @Override
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books.stream().map(book -> conversionService.convert(book, BookDto.class)).collect(Collectors.toList());
    }

    @Override
    public BookDto createBooks(BookDto bookDto) {
        Book book = conversionService.convert(bookDto, Book.class);
        return conversionService.convert(bookRepository.save(book), BookDto.class);
    }

    @Override
    public BookDto updateBooks(BookDto bookDto) throws BookException, AuthorException, PublisherException {
        Book book = bookRepository.findById(bookDto.getId()).orElseThrow(() -> new BookException("Book is not found"));
        book.setAuthor(authorRepositry.findById(bookDto.getAuthorId()).orElseThrow(() -> new AuthorException("Author is not found")));
        book.setGenre(bookDto.getGenre());
        book.setTitle(bookDto.getTitle());
        book.setPublisher(publisherRepository.findById(bookDto.getPublisherId()).orElseThrow(() -> new PublisherException("Publisher is not found")));
        return conversionService.convert(bookRepository.save(book), BookDto.class);
    }

    @Override
    public void deleteBook(Long id) throws BookException {
        Book book = bookRepository.findById(id).orElseThrow(() -> new BookException("Book is not found"));
        bookRepository.delete(book);
    }
}
