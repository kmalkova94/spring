package org.example.bookshop.converter;

import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.entity.Publisher;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PublisherDtoToPublisherConverter implements Converter<PublisherDto, Publisher> {
    @Override
    public Publisher convert(PublisherDto publisherDto) {
        Publisher publisher = new Publisher();
        publisher.setId(publisherDto.getId());
        publisher.setName(publisherDto.getName());
        publisher.setAddress(publisherDto.getAddress());
        publisher.setPhoneNumber(publisherDto.getPhoneNumber());
        return publisher;
    }
}
