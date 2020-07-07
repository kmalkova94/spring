package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.impl.Name;

@Data
public class AuthorDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("authorName")
    private Name name;
}
