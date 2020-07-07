package org.example.bookshop.entity;

import org.example.bookshop.impl.Address;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "storage")
public class Storage {
    private Long id;
    private String placeId;
    private Address address;
}
