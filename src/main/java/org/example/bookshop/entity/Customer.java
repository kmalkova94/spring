package org.example.bookshop.entity;

import lombok.Data;
import org.example.bookshop.enums.CustomerStatus;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customer")
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String login;
    private String password;
    private String name;
    @OneToMany(mappedBy = "customer")
    private Set<Address> deliveryAddress;
    private Long bonuses;
    private String phoneNumber;
    @Enumerated
    private CustomerStatus status;
}
