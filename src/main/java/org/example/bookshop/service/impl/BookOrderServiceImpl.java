package org.example.bookshop.service.impl;

import lombok.AllArgsConstructor;
import org.example.bookshop.dto.AuthorDto;
import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.entity.Author;
import org.example.bookshop.entity.BookOrder;
import org.example.bookshop.exceptions.BookOrderException;
import org.example.bookshop.repository.BookOrderRepository;
import org.example.bookshop.service.BookOrderService;
import org.springframework.core.convert.ConversionService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class BookOrderServiceImpl implements BookOrderService {
    private final BookOrderRepository bookOrderRepository;
    private final ConversionService conversionService;

    @Override
    public BookOrderDto getBookOrderById(Long id) throws BookOrderException {
        BookOrder bookOrder = bookOrderRepository.findById(id).orElseThrow(() -> new BookOrderException("Order is not found"));
        return conversionService.convert(bookOrder, BookOrderDto.class);
    }

    @Override
    public List<BookOrderDto> getAllOrders() {
        List<BookOrder> bookOrders = bookOrderRepository.findAll();
        return bookOrders.stream().map(bookOrder -> conversionService.convert(bookOrder, BookOrderDto.class)).collect(Collectors.toList());
    }

    @Override
    public BookOrderDto createOrder(BookOrderDto bookOrderDto) {
        BookOrder bookOrder = conversionService.convert(bookOrderDto, BookOrder.class);
        return conversionService.convert(bookOrderRepository.save(bookOrder), BookOrderDto.class);
    }

    @Override
    public BookOrderDto updateOrder(BookOrderDto bookOrderDto) throws BookOrderException {
        BookOrder bookOrder = bookOrderRepository.findById(bookOrderDto.getId()).orElseThrow(() -> new BookOrderException("Order is not found"));
        bookOrder.setItems(bookOrderDto.getItems());

        return conversionService.convert(bookOrderRepository.save(bookOrder), BookOrderDto.class);
    }

    @Override
    public void deleteOrder(Long id) throws BookOrderException {
        BookOrder bookOrder = bookOrderRepository.findById(id).orElseThrow(() -> new BookOrderException("Order is not found"));
        bookOrderRepository.delete(bookOrder);
    }
}
