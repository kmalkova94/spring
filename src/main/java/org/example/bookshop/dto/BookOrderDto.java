package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.entity.Book;
import org.joda.time.DateTime;

import java.util.Set;

@Data
public class BookOrderDto {
    @JsonProperty("orderId")
    private Long id;
    @JsonProperty("numOfPositions")
    private Long positions;
    @JsonProperty("items")
    private Set<Book> items;
    @JsonProperty("customer")
    private Long customerId;
    @JsonProperty("creationDate")
    private DateTime creationDate;
    @JsonProperty("deliveryDate")
    private DateTime deliveryDate;
}
