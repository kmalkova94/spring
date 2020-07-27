package org.example.bookshop.converter;

import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.entity.Author;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AuthorDtoToAuthorConverter implements Converter<AuthorDto, Author> {
    @Override
    public Author convert(AuthorDto authorDto) {
        Author author = new Author();
        author.setId(authorDto.getId());
        author.setName(authorDto.getName());
        return author;
    }
}
