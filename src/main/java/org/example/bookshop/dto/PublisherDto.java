package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PublisherDto {
    @JsonProperty("publisherId")
    private Long id;
    @JsonProperty("publisherName")
    private String name;
    @JsonProperty("publisherAddress")
    private String address;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
