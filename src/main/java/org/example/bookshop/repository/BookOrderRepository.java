package org.example.bookshop.repository;

import org.example.bookshop.entity.BookOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOrderRepository extends JpaRepository<BookOrder, Long> {

}
