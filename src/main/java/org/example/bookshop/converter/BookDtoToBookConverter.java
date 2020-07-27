package org.example.bookshop.converter;

import org.example.bookshop.dto.BookDto;
import org.example.bookshop.entity.Book;
import org.example.bookshop.repository.AuthorRepositry;
import org.example.bookshop.repository.PublisherRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookDtoToBookConverter implements Converter<BookDto, Book> {
    private final AuthorRepositry authorRepositry;
    private final PublisherRepository publisherRepository;

    public BookDtoToBookConverter(AuthorRepositry authorRepositry, PublisherRepository publisherRepository) {
        this.authorRepositry = authorRepositry;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Book convert(BookDto bookDto) {
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setAuthor(authorRepositry.findAuthorById(bookDto.getAuthorId()));
        book.setGenre(bookDto.getGenre());
        book.setTitle(bookDto.getTitle());
        book.setPublisher(publisherRepository.findPublisherById(bookDto.getPublisherId()));
        return null;
    }
}
