package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.enums.Genre;
import org.example.bookshop.impl.Address;

@Data
public class BookDto {
    @JsonProperty("bookid")
    private Long id;
    @JsonProperty("booktitle")
    private String title;
    @JsonProperty("author")
    private AuthorDto authorDto;
    @JsonProperty("publisher")
    private PublisherDto publisherDto;
    @JsonProperty("bookgenre")
    private Genre genre;
    @JsonProperty("storage")
    private Address storage;
}
