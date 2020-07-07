package org.example.bookshop.entity;

import org.example.bookshop.enums.CustomerStatus;
import org.example.bookshop.impl.Address;
import org.example.bookshop.impl.Name;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private Name name;
    private Address deliveryAddress;
    private Long bonuses;
    private String phoneNumber;
    private CustomerStatus status;
}
