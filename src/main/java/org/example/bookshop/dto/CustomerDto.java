package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.enums.CustomerStatus;
import org.example.bookshop.impl.Address;
import org.example.bookshop.impl.Name;

@Data
public class CustomerDto {
    @JsonProperty("customerId")
    private Long id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("password")
    private String password;
    @JsonProperty("name")
    private Name name;
    @JsonProperty("deliveryAddress")
    private Address deliveryAddress;
    @JsonProperty("numOfBonuses")
    private Long bonuses;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("customerStatus")
    private CustomerStatus status;

}
