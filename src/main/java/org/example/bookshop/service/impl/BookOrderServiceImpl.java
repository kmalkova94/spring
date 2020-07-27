package org.example.bookshop.service.impl;

import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.entity.BookOrder;
import org.example.bookshop.exceptions.BookOrderException;
import org.example.bookshop.exceptions.CustomerException;
import org.example.bookshop.repository.BookOrderRepository;
import org.example.bookshop.repository.CustomerRepository;
import org.example.bookshop.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class BookOrderServiceImpl implements BookOrderService {
    private final BookOrderRepository bookOrderRepository;
    private final CustomerRepository customerRepository;
    private final ConversionService conversionService;

    @Autowired
    public BookOrderServiceImpl(BookOrderRepository bookOrderRepository, CustomerRepository customerRepository, ConversionService conversionService) {
        this.bookOrderRepository = bookOrderRepository;
        this.customerRepository = customerRepository;
        this.conversionService = conversionService;
    }

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
    public BookOrderDto updateOrder(BookOrderDto bookOrderDto) throws BookOrderException, CustomerException {
        BookOrder bookOrder = bookOrderRepository.findById(bookOrderDto.getId()).orElseThrow(() -> new BookOrderException("Order is not found"));
        bookOrder.setItems(bookOrderDto.getItems());
        bookOrder.setPositions(bookOrderDto.getPositions());
        bookOrder.setDeliveryDate(bookOrderDto.getDeliveryDate());
        bookOrder.setCustomer(customerRepository.findById(bookOrderDto.getCustomerId()).orElseThrow(()-> new CustomerException("Customer is not found")));
        bookOrder.setCreationDate(bookOrder.getCreationDate());
        return conversionService.convert(bookOrderRepository.save(bookOrder), BookOrderDto.class);
    }

    @Override
    public void deleteOrder(Long id) throws BookOrderException {
        BookOrder bookOrder = bookOrderRepository.findById(id).orElseThrow(() -> new BookOrderException("Order is not found"));
        bookOrderRepository.delete(bookOrder);
    }
}
