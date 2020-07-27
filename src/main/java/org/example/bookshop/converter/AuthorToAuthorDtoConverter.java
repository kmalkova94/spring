package org.example.bookshop.converter;

import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.entity.Author;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class AuthorToAuthorDtoConverter implements Converter<Author, AuthorDto> {
    @Override
    public AuthorDto convert(Author author) {
        AuthorDto target = new AuthorDto();
        target.setId(author.getId());
        target.setName(author.getName());
        return target;
    }
}
