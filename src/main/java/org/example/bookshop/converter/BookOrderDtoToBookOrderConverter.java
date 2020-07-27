package org.example.bookshop.converter;

import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.entity.BookOrder;
import org.example.bookshop.repository.CustomerRepository;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookOrderDtoToBookOrderConverter implements Converter<BookOrderDto, BookOrder> {
    private final CustomerRepository customerRepository;

    public BookOrderDtoToBookOrderConverter(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public BookOrder convert(BookOrderDto bookOrderDto) {
        BookOrder bookOrder = new BookOrder();
        bookOrder.setId(bookOrderDto.getId());
        bookOrder.setCreationDate(bookOrderDto.getCreationDate());
        bookOrder.setCustomer(customerRepository.findCustomerById(bookOrderDto.getCustomerId()));
        bookOrder.setDeliveryDate(bookOrderDto.getDeliveryDate());
        bookOrder.setItems(bookOrderDto.getItems());
        bookOrder.setPositions(bookOrderDto.getPositions());
        return bookOrder;
    }
}
