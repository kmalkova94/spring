package org.example.bookshop.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.example.bookshop.entity.Address;
import org.example.bookshop.enums.CustomerStatus;

import java.util.Set;

@Data
public class CustomerDto {
    @JsonProperty("customerId")
    private Long id;
    @JsonProperty("login")
    private String login;
    @JsonProperty("password")
    private String password;
    @JsonProperty("name")
    private String name;
    @JsonProperty("deliveryAddress")
    private Set<Address> deliveryAddress;
    @JsonProperty("numOfBonuses")
    private Long bonuses;
    @JsonProperty("phoneNumber")
    private String phoneNumber;
    @JsonProperty("customerStatus")
    private CustomerStatus status;

}
