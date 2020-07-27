package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.enums.Genre;

@Data
public class BookDto {
    @JsonProperty("bookid")
    private Long id;
    @JsonProperty("booktitle")
    private String title;
    @JsonProperty("author")
    private Long authorId;
    @JsonProperty("publisher")
    private Long publisherId;
    @JsonProperty("bookgenre")
    private Genre genre;
}
