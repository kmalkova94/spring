package org.example.bookshop.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String country;
    private String city;
    private String street;
    private Long index;
    private Long house;
    private Long flat;
    @ManyToOne
    private Customer customer;
}