package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.impl.Address;
import org.example.bookshop.impl.Name;

@Data
public class PublisherDto {
    @JsonProperty("publisherId")
    private Long id;
    @JsonProperty("publisherName")
    private Name name;
    @JsonProperty("publisherAddress")
    private Address address;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
