package org.example.bookshop.entity;

import lombok.Data;
import org.example.bookshop.dto.BookDto;
import org.example.bookshop.dto.CustomerDto;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "bookorder")
public class BookOrder{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long positions;
    @OneToMany(mappedBy = "bookOrders")
    private Set<Book> items;
    @ManyToOne
    private Customer customer;
    private DateTime creationDate;
    private DateTime deliveryDate;
}
