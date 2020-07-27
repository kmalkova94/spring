package org.example.bookshop.converter;

import org.example.bookshop.dto.BookDto;
import org.example.bookshop.entity.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookToBookDtoConverter implements Converter<Book, BookDto> {
    @Override
    public BookDto convert(Book book) {
        BookDto target = new BookDto();
        target.setId(book.getId());
        target.setAuthorId(book.getAuthor().getId());
        target.setGenre(book.getGenre());
        target.setTitle(book.getTitle());
        target.setPublisherId(book.getPublisher().getId());
        return target;
    }
}
