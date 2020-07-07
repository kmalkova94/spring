package org.example.bookshop.entity;

import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.enums.Genre;
import org.example.bookshop.impl.Address;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Author author;
    private Publisher publisher;
    private Genre genre;
    private Address storage;
}
