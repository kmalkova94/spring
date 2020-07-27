package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AddressDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("country")
    private String country;
    @JsonProperty("city")
    private String city;
    @JsonProperty("street")
    private String street;
    @JsonProperty("index")
    private Long index;
    @JsonProperty("house")
    private Long house;
    @JsonProperty("flat")
    private Long flat;
    @JsonProperty("customerId")
    private Long customerId;
}
