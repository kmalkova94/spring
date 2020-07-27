package org.example.bookshop.entity;

import lombok.Data;
import org.example.bookshop.enums.Genre;

import javax.persistence.*;
@Data
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;
    @Enumerated
    private Genre genre;
}
