package org.example.bookshop.converter;

import org.example.bookshop.dto.BookOrderDto;
import org.example.bookshop.entity.BookOrder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookOrderToBookOrderDtoConverter implements Converter<BookOrder, BookOrderDto> {
    @Override
    public BookOrderDto convert(BookOrder bookOrder) {
        BookOrderDto target = new BookOrderDto();
        target.setId(bookOrder.getId());
        target.setCreationDate(bookOrder.getCreationDate());
        target.setCustomerId(bookOrder.getCustomer().getId());
        target.setDeliveryDate(bookOrder.getDeliveryDate());
        target.setItems(bookOrder.getItems());
        target.setPositions(bookOrder.getPositions());
        return target;
    }
}
