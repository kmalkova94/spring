package org.example.bookshop.repository;

import org.example.bookshop.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositry extends JpaRepository<Author, Long> {
    Author findAuthorById(Long id);
}
