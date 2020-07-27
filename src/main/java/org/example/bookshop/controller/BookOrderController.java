package org.example.bookshop.controller;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.BookDto;
import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.exceptions.*;
import org.example.bookshop.service.BookOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/bookOrder")
public class BookOrderController {
    private final BookOrderService bookOrderService;
    @GetMapping(value = "/{bookOrderId}")
    public BookOrderDto getBookId(@PathVariable("id") Long id) throws BookOrderException {
        return bookOrderService.getBookOrderById(id);
    }
    @GetMapping
    public List<BookOrderDto> getAllOrders() {
        return bookOrderService.getAllOrders();
    }

    @PostMapping
    public BookOrderDto createOrder(@RequestBody BookOrderDto bookOrderDto) {
        return bookOrderService.createOrder(bookOrderDto);
    }

    @PutMapping
    public BookOrderDto updateOrder(@RequestBody BookOrderDto bookOrderDto) throws BookOrderException, CustomerException {
        return bookOrderService.updateOrder(bookOrderDto);
    }

    @DeleteMapping
    public void deleteBookOrder(@PathVariable("id") Long id) throws BookOrderException {
        bookOrderService.deleteOrder(id);
    }
}
