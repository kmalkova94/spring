package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AuthorDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("authorName")
    private String name;
}
