package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.joda.time.DateTime;

import java.util.List;

@Data
public class BookOrderDto {
    @JsonProperty("orderId")
    private Long id;
    @JsonProperty("numOfPositions")
    private Long positions;
    @JsonProperty("items")
    private List<BookDto> items;
    @JsonProperty("customer")
    private CustomerDto customerDto;
    @JsonProperty("creationDate")
    private DateTime creationDate;
    @JsonProperty("deliveryDate")
    private DateTime deliveryDate;
}
