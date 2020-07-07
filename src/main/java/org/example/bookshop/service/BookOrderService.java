package org.example.bookshop.service;

import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.exceptions.BookOrderException;

import java.util.List;

public interface BookOrderService {
    BookOrderDto getBookOrderById(Long id) throws BookOrderException;
    List<BookOrderDto> getAllOrders();
    BookOrderDto createOrder(BookOrderDto bookOrderDto);
    BookOrderDto updateOrder(BookOrderDto bookOrderDto) throws BookOrderException;
    void deleteOrder(Long id) throws BookOrderException;
}
