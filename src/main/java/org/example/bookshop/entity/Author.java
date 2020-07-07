package org.example.bookshop.entity;


import lombok.Data;
import org.example.bookshop.impl.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "author")
public class Author {
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private Name name;
}
