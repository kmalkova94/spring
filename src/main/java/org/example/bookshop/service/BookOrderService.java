package org.example.bookshop.service;

import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.exceptions.BookOrderException;
import org.example.bookshop.exceptions.CustomerException;

import java.util.List;

public interface BookOrderService {
    BookOrderDto getBookOrderById(Long id) throws BookOrderException;
    List<BookOrderDto> getAllOrders();
    BookOrderDto createOrder(BookOrderDto bookOrderDto);
    BookOrderDto updateOrder(BookOrderDto bookOrderDto) throws BookOrderException, CustomerException;
    void deleteOrder(Long id) throws BookOrderException;
}
