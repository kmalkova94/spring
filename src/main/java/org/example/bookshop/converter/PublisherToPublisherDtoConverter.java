package org.example.bookshop.converter;

import org.example.bookshop.dto.PublisherDto;
import org.example.bookshop.entity.Publisher;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PublisherToPublisherDtoConverter implements Converter<Publisher, PublisherDto> {
    @Override
    public PublisherDto convert(Publisher publisher) {
        PublisherDto target = new PublisherDto();
        target.setId(publisher.getId());
        target.setName(publisher.getName());
        target.setAddress(publisher.getAddress());
        target.setPhoneNumber(publisher.getPhoneNumber());
        return target;
    }
}
