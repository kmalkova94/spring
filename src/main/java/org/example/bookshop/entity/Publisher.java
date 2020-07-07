package org.example.bookshop.entity;

import org.example.bookshop.impl.Address;
import org.example.bookshop.impl.Name;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {
    private Long id;
    private Name name;
    private Address address;
    private String phoneNumber;
}
