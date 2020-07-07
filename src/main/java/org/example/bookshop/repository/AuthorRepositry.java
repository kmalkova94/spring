package org.example.bookshop.repository;

import org.example.bookshop.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepositry extends JpaRepository<Author, Long> {
}
