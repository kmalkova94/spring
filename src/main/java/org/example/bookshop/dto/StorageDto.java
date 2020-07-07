package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.impl.Address;

@Data
public class StorageDto {
    @JsonProperty("storageId")
    private Long id;
    @JsonProperty("placeId")
    private String placeId;
    @JsonProperty("storageAddress")
    private Address address;
}
